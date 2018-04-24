package model;

public class SetDataCorner {
	
	private Integer minWidth;
	private Integer maxWidth;	
	private Integer minHeight;
	private Integer maxHeight;
	
	
	public SetDataCorner(Integer minWidth, Integer maxWidth, Integer minHeight, Integer maxHeight) 
	{
		this.minWidth = minWidth;
		this.maxWidth = maxWidth;
		this.minHeight = minHeight;
		this.maxHeight = maxHeight;
	}


	public Integer getMinWidth() {
		return minWidth;
	}


	public Integer getMaxWidth() {
		return maxWidth;
	}


	public Integer getMinHeight() {
		return minHeight;
	}


	public Integer getMaxHeight() {
		return maxHeight;
	}	
	
}
