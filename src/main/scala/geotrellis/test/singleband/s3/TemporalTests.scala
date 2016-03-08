package geotrellis.test.singleband.s3

import geotrellis.spark.io._
import geotrellis.spark.io.index.ZCurveKeyIndexMethod
import geotrellis.spark.io.s3.{S3LayerReader, S3LayerWriter}
import geotrellis.test.singleband.TemporalTestEnvironment
import geotrellis.util.{S3Support, SparkSupport}

trait TemporalTests extends SparkSupport with TemporalTestEnvironment with S3Support with Serializable {
  @transient lazy val writer = S3LayerWriter[K, V, M](s3Bucket, s3IngestPreifx, ZCurveKeyIndexMethod.byYear)
  @transient lazy val reader = S3LayerReader[K, V, M](s3Bucket, s3IngestPreifx)
}
