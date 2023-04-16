package tofu.systemenv

trait SystemEnv[F[_]] {
  def get(name: String): F[Option[String]]
}