// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.swagger._public.uac.api

import scala.collection.mutable
import scala.concurrent.{Await, ExecutionContext, Future}
import scala.concurrent.duration.Duration
import scala.util.Try

import ai.verta.swagger.client.HttpClient
import ai.verta.swagger.client.objects._
import ai.verta.swagger._public.uac.model._

class CollaboratorApi(client: HttpClient, val basePath: String = "/v1") {
  def addOrUpdateDatasetCollaboratorAsync(body: UacAddCollaboratorRequest)(implicit ec: ExecutionContext): Future[Try[UacAddCollaboratorRequestResponse]] = {
    var __query = new mutable.HashMap[String,String]
    if (body == null) throw new Exception("Missing required parameter \"body\"")
    return client.request[UacAddCollaboratorRequest, UacAddCollaboratorRequestResponse]("POST", basePath + s"/collaborator/addOrUpdateDatasetCollaborator", __query.toMap, body, UacAddCollaboratorRequestResponse.fromJson)
  }

  def addOrUpdateDatasetCollaborator(body: UacAddCollaboratorRequest)(implicit ec: ExecutionContext): Try[UacAddCollaboratorRequestResponse] = Await.result(addOrUpdateDatasetCollaboratorAsync(body), Duration.Inf)

  def addOrUpdateProjectCollaboratorAsync(body: UacAddCollaboratorRequest)(implicit ec: ExecutionContext): Future[Try[UacAddCollaboratorRequestResponse]] = {
    var __query = new mutable.HashMap[String,String]
    if (body == null) throw new Exception("Missing required parameter \"body\"")
    return client.request[UacAddCollaboratorRequest, UacAddCollaboratorRequestResponse]("POST", basePath + s"/collaborator/addOrUpdateProjectCollaborator", __query.toMap, body, UacAddCollaboratorRequestResponse.fromJson)
  }

  def addOrUpdateProjectCollaborator(body: UacAddCollaboratorRequest)(implicit ec: ExecutionContext): Try[UacAddCollaboratorRequestResponse] = Await.result(addOrUpdateProjectCollaboratorAsync(body), Duration.Inf)

  def addOrUpdateRepositoryCollaboratorAsync(body: UacAddCollaboratorRequest)(implicit ec: ExecutionContext): Future[Try[UacAddCollaboratorRequestResponse]] = {
    var __query = new mutable.HashMap[String,String]
    if (body == null) throw new Exception("Missing required parameter \"body\"")
    return client.request[UacAddCollaboratorRequest, UacAddCollaboratorRequestResponse]("POST", basePath + s"/collaborator/addOrUpdateRepositoryCollaborator", __query.toMap, body, UacAddCollaboratorRequestResponse.fromJson)
  }

  def addOrUpdateRepositoryCollaborator(body: UacAddCollaboratorRequest)(implicit ec: ExecutionContext): Try[UacAddCollaboratorRequestResponse] = Await.result(addOrUpdateRepositoryCollaboratorAsync(body), Duration.Inf)

  def getDatasetCollaboratorsAsync(entity_id: Option[String]=None)(implicit ec: ExecutionContext): Future[Try[UacGetCollaboratorResponse]] = {
    var __query = new mutable.HashMap[String,String]
    if (entity_id.isDefined) __query.update("entity_id", client.toQuery(entity_id.get))
    val body: String = null
    return client.request[String, UacGetCollaboratorResponse]("GET", basePath + s"/collaborator/getDatasetCollaborators", __query.toMap, body, UacGetCollaboratorResponse.fromJson)
  }

  def getDatasetCollaborators(entity_id: Option[String]=None)(implicit ec: ExecutionContext): Try[UacGetCollaboratorResponse] = Await.result(getDatasetCollaboratorsAsync(entity_id), Duration.Inf)

  def getProjectCollaboratorsAsync(entity_id: Option[String]=None)(implicit ec: ExecutionContext): Future[Try[UacGetCollaboratorResponse]] = {
    var __query = new mutable.HashMap[String,String]
    if (entity_id.isDefined) __query.update("entity_id", client.toQuery(entity_id.get))
    val body: String = null
    return client.request[String, UacGetCollaboratorResponse]("GET", basePath + s"/collaborator/getProjectCollaborators", __query.toMap, body, UacGetCollaboratorResponse.fromJson)
  }

  def getProjectCollaborators(entity_id: Option[String]=None)(implicit ec: ExecutionContext): Try[UacGetCollaboratorResponse] = Await.result(getProjectCollaboratorsAsync(entity_id), Duration.Inf)

  def getRepositoryCollaboratorsAsync(entity_id: Option[String]=None)(implicit ec: ExecutionContext): Future[Try[UacGetCollaboratorResponse]] = {
    var __query = new mutable.HashMap[String,String]
    if (entity_id.isDefined) __query.update("entity_id", client.toQuery(entity_id.get))
    val body: String = null
    return client.request[String, UacGetCollaboratorResponse]("GET", basePath + s"/collaborator/getRepositoryCollaborators", __query.toMap, body, UacGetCollaboratorResponse.fromJson)
  }

  def getRepositoryCollaborators(entity_id: Option[String]=None)(implicit ec: ExecutionContext): Try[UacGetCollaboratorResponse] = Await.result(getRepositoryCollaboratorsAsync(entity_id), Duration.Inf)

  def removeDatasetCollaboratorAsync(authz_entity_type: Option[String]=None, date_deleted: Option[BigInt]=None, entity_id: Option[String]=None, share_with: Option[String]=None)(implicit ec: ExecutionContext): Future[Try[UacRemoveCollaboratorResponse]] = {
    var __query = new mutable.HashMap[String,String]
    if (entity_id.isDefined) __query.update("entity_id", client.toQuery(entity_id.get))
    if (share_with.isDefined) __query.update("share_with", client.toQuery(share_with.get))
    if (date_deleted.isDefined) __query.update("date_deleted", client.toQuery(date_deleted.get))
    if (authz_entity_type.isDefined) __query.update("authz_entity_type", client.toQuery(authz_entity_type.get))
    val body: String = null
    return client.request[String, UacRemoveCollaboratorResponse]("DELETE", basePath + s"/collaborator/removeDatasetCollaborator", __query.toMap, body, UacRemoveCollaboratorResponse.fromJson)
  }

  def removeDatasetCollaborator(authz_entity_type: Option[String]=None, date_deleted: Option[BigInt]=None, entity_id: Option[String]=None, share_with: Option[String]=None)(implicit ec: ExecutionContext): Try[UacRemoveCollaboratorResponse] = Await.result(removeDatasetCollaboratorAsync(authz_entity_type, date_deleted, entity_id, share_with), Duration.Inf)

  def removeProjectCollaboratorAsync(authz_entity_type: Option[String]=None, date_deleted: Option[BigInt]=None, entity_id: Option[String]=None, share_with: Option[String]=None)(implicit ec: ExecutionContext): Future[Try[UacRemoveCollaboratorResponse]] = {
    var __query = new mutable.HashMap[String,String]
    if (entity_id.isDefined) __query.update("entity_id", client.toQuery(entity_id.get))
    if (share_with.isDefined) __query.update("share_with", client.toQuery(share_with.get))
    if (date_deleted.isDefined) __query.update("date_deleted", client.toQuery(date_deleted.get))
    if (authz_entity_type.isDefined) __query.update("authz_entity_type", client.toQuery(authz_entity_type.get))
    val body: String = null
    return client.request[String, UacRemoveCollaboratorResponse]("DELETE", basePath + s"/collaborator/removeProjectCollaborator", __query.toMap, body, UacRemoveCollaboratorResponse.fromJson)
  }

  def removeProjectCollaborator(authz_entity_type: Option[String]=None, date_deleted: Option[BigInt]=None, entity_id: Option[String]=None, share_with: Option[String]=None)(implicit ec: ExecutionContext): Try[UacRemoveCollaboratorResponse] = Await.result(removeProjectCollaboratorAsync(authz_entity_type, date_deleted, entity_id, share_with), Duration.Inf)

  def removeRepositoryCollaboratorAsync(authz_entity_type: Option[String]=None, date_deleted: Option[BigInt]=None, entity_id: Option[String]=None, share_with: Option[String]=None)(implicit ec: ExecutionContext): Future[Try[UacRemoveCollaboratorResponse]] = {
    var __query = new mutable.HashMap[String,String]
    if (entity_id.isDefined) __query.update("entity_id", client.toQuery(entity_id.get))
    if (share_with.isDefined) __query.update("share_with", client.toQuery(share_with.get))
    if (date_deleted.isDefined) __query.update("date_deleted", client.toQuery(date_deleted.get))
    if (authz_entity_type.isDefined) __query.update("authz_entity_type", client.toQuery(authz_entity_type.get))
    val body: String = null
    return client.request[String, UacRemoveCollaboratorResponse]("DELETE", basePath + s"/collaborator/removeRepositoryCollaborator", __query.toMap, body, UacRemoveCollaboratorResponse.fromJson)
  }

  def removeRepositoryCollaborator(authz_entity_type: Option[String]=None, date_deleted: Option[BigInt]=None, entity_id: Option[String]=None, share_with: Option[String]=None)(implicit ec: ExecutionContext): Try[UacRemoveCollaboratorResponse] = Await.result(removeRepositoryCollaboratorAsync(authz_entity_type, date_deleted, entity_id, share_with), Duration.Inf)

}
