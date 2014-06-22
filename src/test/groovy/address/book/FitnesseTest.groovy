package address.book

import fitnesse.junit.FitNesseSuite
import fitnesse.junit.JUnitHelper
import fitnesse.junit.JUnitXMLTestListener
import org.junit.Test
import org.junit.runner.RunWith


//@RunWith(FitNesseSuite)
//@FitNesseSuite.FitnesseDir(value = 'fitnesse')
//@FitNesseSuite.Name(value = 'FrontPage.Navigation')
//@FitNesseSuite.OutputDir(value = 'target/fitnesse')
class FitnesseTest {

    @Test
    void runTests() {
        JUnitHelper helper=new JUnitHelper('fitnesse', 'target/fitnesse', new JUnitXMLTestListener('target/surefire-reports'))
        helper.assertSuitePasses('FrontPage.NavigatioN')
    }
}
