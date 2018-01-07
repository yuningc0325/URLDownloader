/**
 * the class contains variable of the download interface that we can use.
 * @author rickchang
 *
 */


public class Html {

	private String url;
	private String filename;
	
	/**
	 * constructor of Gtml 
	 * @param url, users can enter the url.
	 * @param filename, uers can give the downloaded file a name.
	 */
	public Html(String url,String filename) {
		this.url=url;
		this.filename=filename;
	}
	
	/**
	 * setter 
	 * @param url
	 */
	public void setUrl(String url) {
		this.url=url;
	}
	
	/**
	 * setter
	 * @param filename
	 */
	public void setFilename(String filename) {
		this.filename=filename;
	}
	
	/**
	 * getter
	 * @return url
	 */
	public String getUrl() {
		return url;
	}
	
	/**
	 * getter
	 * @return filename
	 */
	public String getFilename(){
		return filename;
	}
	
	
	
	
	
}
