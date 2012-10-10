package net.jeeeyul.erd.wizard

import java.io.ByteArrayInputStream

class NewERDFileTemeplate {
	def private String generate(String fileName)'''
		<?xml version="1.0" encoding="UTF-8"?>
		<pi:Diagram xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:al="http://eclipse.org/graphiti/mm/algorithms" xmlns:pi="http://eclipse.org/graphiti/mm/pictograms" visible="true" gridUnit="10" diagramTypeId="net.jeeeyul.erd.diagramType" name="«fileName»" snapToGrid="true" version="0.10.0">
		  <graphicsAlgorithm xsi:type="al:Rectangle" background="//@colors.1" foreground="//@colors.0" lineWidth="1" transparency="0.0" width="1000" height="1000"/>
		  <colors red="227" green="238" blue="249"/>
		  <colors red="255" green="255" blue="255"/>
		</pi:Diagram>
	'''
	
	def getContents(String fileName){
		new ByteArrayInputStream(generate(fileName).getBytes("UTF-8"))
	} 
}