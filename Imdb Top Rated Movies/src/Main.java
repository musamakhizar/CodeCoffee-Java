//A program to scrap data of Top Rated IMDB movies

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

class TopMovie{
	private String movieName;
	private String rating;
	public TopMovie() {
		this.movieName = null;
		this.rating = null;
	}
	public TopMovie(String movieName, String rating) {
		this.movieName = movieName;
		this.rating = rating;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
}

public class Main {

	
	public static void main(String[] args) {
		
		/* Steps
		 * 1-Establish connection with the webpage (website) using JSsoup connect and get the document and store it in Document object
		 * 2-Select the element using the Document object and pass that in Elements object
		 * 3-Iterate over the element list to get desired elements
		 * */
		
		try {
			//	The website is intelligent enough to catch request from non browser application 
			//	so to fake it we add user agent here
			
			Document doc = Jsoup.connect("https://www.imdb.com/search/title/?year=2020&title_type=feature&").userAgent("mozilla/17.0").get();
			
			Elements tempE = doc.select("div.lister-list");
			
			Elements name = null;
			Elements rating = null ;
			
			//List to store object of top Movie
			
			List<TopMovie> topMovieList = new ArrayList<TopMovie>();
			
			
			for (Element mList : tempE) {
				name = mList.getElementsByTag("h3").tagName("a");
				rating = mList.getElementsByClass("ratings-imdb-rating").tagName("strong");
				
			}
			
			
			List<String> nameList = new ArrayList<String>();
			List<String> ratingList = new ArrayList<String>();
			
			//Iterate over name Element and put it in nameList
			for (Element element : name) {
				if(element.firstElementSibling().text()!=null) {
					nameList.add(element.firstElementSibling().text()); //this will select the first element sibling from list and put it in nameLis
					 
				}
				
			}
			
			//Iterate over rating Element and put it in ratingList
			for (Element element : rating) {
				if(element.firstElementSibling().text()!=null) {
					ratingList.add(element.firstElementSibling().text()); //this will select the first element sibling from list and put it in ratingLis
					 
				}
				
			}
			
			
			// Now iterate over 2 list at the same time using iterator and put both's data in TopMovie List

			Iterator<String > it1 = nameList.iterator();
			Iterator<String> it2 = ratingList.iterator();

			while (it1.hasNext() && it2.hasNext()) {
			    topMovieList.add(new TopMovie(it1.next(),it2.next() ));
			}
			
			
			//how iterating TopMovie List to check 
			for (TopMovie x : topMovieList) {
				System.out.println("\n"+x.getMovieName()
						+ "\n Rating : "+ x.getRating());
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
