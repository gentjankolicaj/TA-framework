package com.ta.framework.selenium;
/**
 * @author gentjan kolicaj
 *
 */
public enum HtmlTag {
	
	HTML("html","<html>","</html>"),HEAD("head","<head>","</head>"),META("meta","<meta>","</meta>"),TITLE("title","<title>","</title>"),
	HEADER("header","<header>","</header>"),BODY("body","<body>","</body>"),DIV("div","<div>","</div>"),SCRIPT("script","<script>","</script>"),
	LINK("link","<link>","</link>"),ARTICLE("article","<article>","</article>"),FOOTER("footer","<footer>","</footer>"),
	IFRAME("iframe","<iframe>","</iframe>"),H1("h1","<h1>","</h1>"),H2("h2","<h2>","</h3>"),H3("h3","<h3>","</h3>"),
	H4("h4","<h4>","</h4>"),H5("h5","<h5>","</h5>"),H6("h6","<h6>","</h6>"),H7("h7","<h7>","</h7>"),H8("h8","<h8>","</h8>"),
	H9("h9","<h9>","</h9>"),H10("h10","<h10>","</h10>"),SPAN("span","<span>","</span>"),NAV("nav","<nav>","</nav>"),
	A("a","<a>","</a>"),SVG("svg","<svg>","</svg>"),LI("li","<li>","</li>"),OL("ol","<ol>","</ol>"),
	UL("ul","<ul>","</ul>"),P("p","<p>","</p>"),FIGURE("figure","<figure>","</figure>"),IMG("img","<img>","</img>"),
	MAIN("main","<main>","</main>"),FORM("form","<form>","</form>"),INPUT("input","<input>","</input>");
	
	private String name;
	private String openingTag;
	private String closingTag;
	
	private HtmlTag(String name,String openingTag,String closingTag) {
		this.name=name;
		this.openingTag=openingTag;
		this.closingTag=closingTag;
	}

	
	public String getName() {
		return name;
	}

	public String getOpeningTag() {
		return openingTag;
	}

	public String getClosingTag() {
		return closingTag;
	}

	
	
}
