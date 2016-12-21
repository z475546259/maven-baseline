package com.seleniumwork.util;


/**
 * This is for element library
 * 
 * @author Young
 *
 */
public class Locator {
	public String element;

	private int waitSec;

	/**
	 * create a enum variable for By
	 * 枚举类型：在实际问题中，有些变量的取值被限定在一个有限的范围内
	 * @author Young
	 *
	 */
	public enum ByType {
		xpath, id, linkText, name, className, cssSelector, partialLinkText, tagName
	}

	private ByType byType;

	public Locator() {

	}

	/**
	 * defaut Locator ,use Xpath
	 * 
	 * @author Young
	 * @param element
	 */
	public Locator(String element) {
		this.element = element;
		this.waitSec = 3;
		this.byType = ByType.xpath;
	}

	public Locator(String element, int waitSec) {
		this.waitSec = waitSec;
		this.element = element;
		this.byType = ByType.xpath;
	}

	public Locator(String element, int waitSec, ByType byType) {
		this.waitSec = waitSec;
		this.element = element;
		this.byType = byType;
	}

	public String getElement() {
		return element;
	}

	public int getWaitSec() {
		return waitSec;
	}

	public ByType getBy() {
		return byType;
	}

	public void setBy(ByType byType) {
		this.byType = byType;
	}

	public void setReplace(String rep, String rex)
	{
		StringTools.replaceAll(element, rex, rep);
	}
}
