<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html"/>
    <xsl:template match="/CottonDesk/SalesPerson1">
        <body>
            <h1 align="center">
                <font color="red">
                    <xsl:text>NAME:</xsl:text>
                    <xsl:value-of select="Name"/>
                    <xsl:text> Age:</xsl:text>
                    <xsl:value-of select="Age"/>
                    <xsl:text> Product:</xsl:text>
                    <xsl:value-of select="Product"/>
                    <xsl:text> Sales:</xsl:text>
                    <xsl:value-of select="Sales"/>
                </font>
            </h1>
        </body>
    </xsl:template>

    <xsl:template match="/CottonDesk/SalesPerson2">
        <body>
            <h1 align="center">
                <font color="blue">
                    <xsl:text>NAME:</xsl:text>
                    <xsl:value-of select="Name"/>
                    <xsl:text> Age:</xsl:text>
                    <xsl:value-of select="Age"/>
                    <xsl:text> Product:</xsl:text>
                    <xsl:value-of select="Product"/>
                    <xsl:text> Sales:</xsl:text>
                    <xsl:value-of select="Sales"/>
                </font>
            </h1>
        </body>
    </xsl:template>

    <xsl:template match="/CottonDesk/SalesPerson3">
        <body>
            <h1 align="center">
                <font color="black">
                    <xsl:text>NAME:</xsl:text>
                    <xsl:value-of select="Name"/>
                    <xsl:text> Age:</xsl:text>
                    <xsl:value-of select="Age"/>
                    <xsl:text> Product:</xsl:text>
                    <xsl:value-of select="Product"/>
                    <xsl:text> Sales:</xsl:text>
                    <xsl:value-of select="Sales"/>
                </font>
            </h1>
        </body>
    </xsl:template>

    <xsl:template match="/CottonDesk/SalesPerson4">
        <body BGCOLOR="PINK">
            <h1 align="center">
                <font color="green">
                    <xsl:text>NAME:</xsl:text>
                    <xsl:value-of select="Name"/>
                    <xsl:text> Age:</xsl:text>
                    <xsl:value-of select="Age"/>
                    <xsl:text> Product:</xsl:text>
                    <xsl:value-of select="Product"/>
                    <xsl:text> Sales:</xsl:text>
                    <xsl:value-of select="Sales"/>
                </font>
            </h1>
        </body>
    </xsl:template>

    <xsl:template match="/CottonDesk/SalesPerson5">
        <body>
            <h1 align="center">
                <font color="yellow">
                    <xsl:text>NAME:</xsl:text>
                    <xsl:value-of select="Name"/>
                    <xsl:text> Age:</xsl:text>
                    <xsl:value-of select="Age"/>
                    <xsl:text> Product:</xsl:text>
                    <xsl:value-of select="Product"/>
                    <xsl:text> Sales:</xsl:text>
                    <xsl:value-of select="Sales"/>
                </font>
            </h1>
        </body>
    </xsl:template>

    <xsl:template match="/CottonDesk/SalesPerson">
        <body>
            <h1 align="center">
                <font color="red">
                    <xsl:text>NAME:</xsl:text>
                    <xsl:value-of select="Name"/>
                    <xsl:text> Age:</xsl:text>
                    <xsl:value-of select="Age"/>
                    <xsl:text> Product:</xsl:text>
                    <xsl:value-of select="Product"/>
                    <xsl:text> Sales:</xsl:text>
                    <xsl:value-of select="Sales"/>
                </font>
            </h1>
        </body>
    </xsl:template>

</xsl:stylesheet>