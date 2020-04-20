<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template match="states">
        <HTML>
            <HEAD>
                <TITLE>
                    State Data
                </TITLE>
            </HEAD>
            <BODY>
                <H1>
                    State Data
                </H1>
                <TATBLE BORDER="1">
                    <TR BGCOLOR ="CYAN">
                        <TH>Name</TH>
                        <TH>Poplutation</TH>
                        <TH>Capital</TH>
                        <TH>Bird</TH>
                        <TH>Flower</TH>
                        <TH>Area</TH>
                    </TR>
                    <xsl:apply-templates/>
                </TATBLE>
            </BODY>
        </HTML>
    </xsl:template>

    <xsl:template match="states">
        <TR>
            <TD>
                <xsl:value-of select="name"/>
            </TD>
            <TD>
                <xsl:apply-templates select="population"/>
            </TD>
            <TD>
                <xsl:apply-templates select="capital"/>
            </TD>
            <TD>
                <xsl:apply-templates select="bird"/>
            </TD>
            <TD>
                <xsl:apply-templates select="flower"/>
            </TD>
        </TR>
    </xsl:template>
</xsl:stylesheet>