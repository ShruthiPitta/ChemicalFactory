package factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;

/**
 * Created by shruthip on 01/06/16.
 */
public class ChemicalFactoryTest {
    ChemicalFactory chemicalFactory;
    Map recipeX;
    Chemical chemX;
    Chemical chemY;
    Chemical chemZ;

    @Before
    public void Setup()
    {
        chemicalFactory = new ChemicalFactory();

    }

    @Test
    public void testProcessChemXChemX(){
        ArrayList<Chemical> chemicalsList = new ArrayList();
        chemicalsList.add(ChemicalBuilder.createChemicalX());
        chemicalsList.add(ChemicalBuilder.createChemicalX());
        Assert.assertThat(chemicalFactory.processingTime(chemicalsList), is(13));
    }

    @Test
    public void testProcessChemXChemXChemZ(){
        List<Chemical> chemicalsList = new ArrayList();
        chemicalsList.add(ChemicalBuilder.createChemicalX());
        chemicalsList.add(ChemicalBuilder.createChemicalX());
        chemicalsList.add(ChemicalBuilder.createChemicalZ());
        Assert.assertThat(chemicalFactory.processingTime(chemicalsList), is(17));
    }

    @Test
    public void testProcessChemXChemY(){
        List<Chemical> chemicalsList = new ArrayList();
        chemicalsList.add(ChemicalBuilder.createChemicalX());
        chemicalsList.add(ChemicalBuilder.createChemicalY());
        Assert.assertThat(chemicalFactory.processingTime(chemicalsList), is(12));
    }

    @Test
    public void testProcessChemYChemYChemYChemXChemZ(){
        List<Chemical> chemicalsList = new ArrayList();
        chemicalsList.add(ChemicalBuilder.createChemicalY());
        chemicalsList.add(ChemicalBuilder.createChemicalY());
        chemicalsList.add(ChemicalBuilder.createChemicalY());
        chemicalsList.add(ChemicalBuilder.createChemicalX());
        chemicalsList.add(ChemicalBuilder.createChemicalZ());
        Assert.assertThat(chemicalFactory.processingTime(chemicalsList), is(17));
    }

}