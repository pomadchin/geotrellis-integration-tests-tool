package geotrellis.test.multiband.hadoop

import geotrellis.spark._
import geotrellis.spark.io._
import geotrellis.test.multiband.load.HadoopLoad
import geotrellis.vector.ProjectedExtent

import org.apache.spark.SparkContext

abstract class HadoopIngestTests extends Tests[ProjectedExtent, SpatialKey] with HadoopLoad

object HadoopIngestTests {
  def apply(implicit _sc: SparkContext) = new HadoopIngestTests {
    @transient implicit val sc = _sc
  }
}
