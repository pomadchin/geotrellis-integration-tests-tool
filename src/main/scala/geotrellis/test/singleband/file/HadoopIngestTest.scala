package geotrellis.test.singleband.file

import geotrellis.config.Dataset
import geotrellis.raster.Tile
import geotrellis.spark._
import geotrellis.spark.io._
import geotrellis.test.FileTest
import geotrellis.test.singleband.load.HadoopLoad
import geotrellis.vector.ProjectedExtent

import org.apache.spark.SparkContext

abstract class HadoopIngestTest(dataset: Dataset) extends FileTest[ProjectedExtent, SpatialKey, Tile](dataset) with HadoopLoad

object HadoopIngestTest {
  def apply(implicit dataset: Dataset, _sc: SparkContext) = new HadoopIngestTest(dataset) {
    @transient implicit val sc = _sc
  }
}
