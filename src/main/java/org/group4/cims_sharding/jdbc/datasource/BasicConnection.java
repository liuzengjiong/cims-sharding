package org.group4.cims_sharding.jdbc.datasource;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.Executor;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ExceptionInterceptor;
import com.mysql.jdbc.Extension;
import com.mysql.jdbc.MySQLConnection;
import com.mysql.jdbc.log.Log;

/**
 * @TODO 
 * @author Jiong
 * @Date 2017年7月16日
 */
public class BasicConnection implements Connection{

	/* (non-Javadoc)
	 * @see java.sql.Connection#clearWarnings()
	 */
	public void clearWarnings() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#close()
	 */
	public void close() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#commit()
	 */
	public void commit() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#createArrayOf(java.lang.String, java.lang.Object[])
	 */
	public Array createArrayOf(String typeName, Object[] elements)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#createBlob()
	 */
	public Blob createBlob() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#createClob()
	 */
	public Clob createClob() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#createNClob()
	 */
	public NClob createNClob() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#createSQLXML()
	 */
	public SQLXML createSQLXML() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#createStatement()
	 */
	public Statement createStatement() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#createStatement(int, int)
	 */
	public Statement createStatement(int resultSetType, int resultSetConcurrency)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#createStatement(int, int, int)
	 */
	public Statement createStatement(int resultSetType,
			int resultSetConcurrency, int resultSetHoldability)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#createStruct(java.lang.String, java.lang.Object[])
	 */
	public Struct createStruct(String typeName, Object[] attributes)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#getAutoCommit()
	 */
	public boolean getAutoCommit() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#getCatalog()
	 */
	public String getCatalog() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#getClientInfo()
	 */
	public Properties getClientInfo() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#getClientInfo(java.lang.String)
	 */
	public String getClientInfo(String name) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#getHoldability()
	 */
	public int getHoldability() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#getMetaData()
	 */
	public DatabaseMetaData getMetaData() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#getTransactionIsolation()
	 */
	public int getTransactionIsolation() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#getTypeMap()
	 */
	public Map<String, Class<?>> getTypeMap() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#getWarnings()
	 */
	public SQLWarning getWarnings() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#isClosed()
	 */
	public boolean isClosed() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#isReadOnly()
	 */
	public boolean isReadOnly() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#isValid(int)
	 */
	public boolean isValid(int timeout) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#nativeSQL(java.lang.String)
	 */
	public String nativeSQL(String sql) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#prepareCall(java.lang.String)
	 */
	public CallableStatement prepareCall(String sql) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#prepareCall(java.lang.String, int, int)
	 */
	public CallableStatement prepareCall(String sql, int resultSetType,
			int resultSetConcurrency) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#prepareCall(java.lang.String, int, int, int)
	 */
	public CallableStatement prepareCall(String sql, int resultSetType,
			int resultSetConcurrency, int resultSetHoldability)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#prepareStatement(java.lang.String)
	 */
	public PreparedStatement prepareStatement(String sql) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#prepareStatement(java.lang.String, int)
	 */
	public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#prepareStatement(java.lang.String, int[])
	 */
	public PreparedStatement prepareStatement(String sql, int[] columnIndexes)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#prepareStatement(java.lang.String, java.lang.String[])
	 */
	public PreparedStatement prepareStatement(String sql, String[] columnNames)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#prepareStatement(java.lang.String, int, int)
	 */
	public PreparedStatement prepareStatement(String sql, int resultSetType,
			int resultSetConcurrency) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#prepareStatement(java.lang.String, int, int, int)
	 */
	public PreparedStatement prepareStatement(String sql, int resultSetType,
			int resultSetConcurrency, int resultSetHoldability)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#releaseSavepoint(java.sql.Savepoint)
	 */
	public void releaseSavepoint(Savepoint savepoint) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#rollback()
	 */
	public void rollback() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#rollback(java.sql.Savepoint)
	 */
	public void rollback(Savepoint savepoint) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setAutoCommit(boolean)
	 */
	public void setAutoCommit(boolean autoCommit) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setCatalog(java.lang.String)
	 */
	public void setCatalog(String catalog) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setClientInfo(java.util.Properties)
	 */
	public void setClientInfo(Properties properties)
			throws SQLClientInfoException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setClientInfo(java.lang.String, java.lang.String)
	 */
	public void setClientInfo(String name, String value)
			throws SQLClientInfoException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setHoldability(int)
	 */
	public void setHoldability(int holdability) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setReadOnly(boolean)
	 */
	public void setReadOnly(boolean readOnly) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setSavepoint()
	 */
	public Savepoint setSavepoint() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setSavepoint(java.lang.String)
	 */
	public Savepoint setSavepoint(String name) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setTransactionIsolation(int)
	 */
	public void setTransactionIsolation(int level) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setTypeMap(java.util.Map)
	 */
	public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Wrapper#isWrapperFor(java.lang.Class)
	 */
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.Wrapper#unwrap(java.lang.Class)
	 */
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#exposeAsXml()
	 */
	public String exposeAsXml() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getAllowLoadLocalInfile()
	 */
	public boolean getAllowLoadLocalInfile() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getAllowMasterDownConnections()
	 */
	public boolean getAllowMasterDownConnections() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getAllowMultiQueries()
	 */
	public boolean getAllowMultiQueries() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getAllowNanAndInf()
	 */
	public boolean getAllowNanAndInf() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getAllowUrlInLocalInfile()
	 */
	public boolean getAllowUrlInLocalInfile() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getAlwaysSendSetIsolation()
	 */
	public boolean getAlwaysSendSetIsolation() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getAuthenticationPlugins()
	 */
	public String getAuthenticationPlugins() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getAutoClosePStmtStreams()
	 */
	public boolean getAutoClosePStmtStreams() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getAutoDeserialize()
	 */
	public boolean getAutoDeserialize() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getAutoGenerateTestcaseScript()
	 */
	public boolean getAutoGenerateTestcaseScript() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getAutoReconnectForPools()
	 */
	public boolean getAutoReconnectForPools() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getAutoSlowLog()
	 */
	public boolean getAutoSlowLog() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getBlobSendChunkSize()
	 */
	public int getBlobSendChunkSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getBlobsAreStrings()
	 */
	public boolean getBlobsAreStrings() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getCacheCallableStatements()
	 */
	public boolean getCacheCallableStatements() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getCacheCallableStmts()
	 */
	public boolean getCacheCallableStmts() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getCachePrepStmts()
	 */
	public boolean getCachePrepStmts() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getCachePreparedStatements()
	 */
	public boolean getCachePreparedStatements() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getCacheResultSetMetadata()
	 */
	public boolean getCacheResultSetMetadata() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getCacheServerConfiguration()
	 */
	public boolean getCacheServerConfiguration() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getCallableStatementCacheSize()
	 */
	public int getCallableStatementCacheSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getCallableStmtCacheSize()
	 */
	public int getCallableStmtCacheSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getCapitalizeTypeNames()
	 */
	public boolean getCapitalizeTypeNames() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getCharacterSetResults()
	 */
	public String getCharacterSetResults() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getClientCertificateKeyStorePassword()
	 */
	public String getClientCertificateKeyStorePassword() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getClientCertificateKeyStoreType()
	 */
	public String getClientCertificateKeyStoreType() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getClientCertificateKeyStoreUrl()
	 */
	public String getClientCertificateKeyStoreUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getClientInfoProvider()
	 */
	public String getClientInfoProvider() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getClobCharacterEncoding()
	 */
	public String getClobCharacterEncoding() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getClobberStreamingResults()
	 */
	public boolean getClobberStreamingResults() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getCompensateOnDuplicateKeyUpdateCounts()
	 */
	public boolean getCompensateOnDuplicateKeyUpdateCounts() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getConnectTimeout()
	 */
	public int getConnectTimeout() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getConnectionAttributes()
	 */
	public String getConnectionAttributes() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getConnectionCollation()
	 */
	public String getConnectionCollation() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getConnectionLifecycleInterceptors()
	 */
	public String getConnectionLifecycleInterceptors() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getContinueBatchOnError()
	 */
	public boolean getContinueBatchOnError() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getCreateDatabaseIfNotExist()
	 */
	public boolean getCreateDatabaseIfNotExist() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getDefaultAuthenticationPlugin()
	 */
	public String getDefaultAuthenticationPlugin() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getDefaultFetchSize()
	 */
	public int getDefaultFetchSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getDisabledAuthenticationPlugins()
	 */
	public String getDisabledAuthenticationPlugins() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getDisconnectOnExpiredPasswords()
	 */
	public boolean getDisconnectOnExpiredPasswords() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getDontTrackOpenResources()
	 */
	public boolean getDontTrackOpenResources() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getDumpMetadataOnColumnNotFound()
	 */
	public boolean getDumpMetadataOnColumnNotFound() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getDumpQueriesOnException()
	 */
	public boolean getDumpQueriesOnException() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getDynamicCalendars()
	 */
	public boolean getDynamicCalendars() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getElideSetAutoCommits()
	 */
	public boolean getElideSetAutoCommits() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getEmptyStringsConvertToZero()
	 */
	public boolean getEmptyStringsConvertToZero() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getEmulateLocators()
	 */
	public boolean getEmulateLocators() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getEmulateUnsupportedPstmts()
	 */
	public boolean getEmulateUnsupportedPstmts() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getEnablePacketDebug()
	 */
	public boolean getEnablePacketDebug() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getEnableQueryTimeouts()
	 */
	public boolean getEnableQueryTimeouts() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getEncoding()
	 */
	public String getEncoding() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getExceptionInterceptor()
	 */
	public ExceptionInterceptor getExceptionInterceptor() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getExceptionInterceptors()
	 */
	public String getExceptionInterceptors() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getExplainSlowQueries()
	 */
	public boolean getExplainSlowQueries() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getFailOverReadOnly()
	 */
	public boolean getFailOverReadOnly() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getFunctionsNeverReturnBlobs()
	 */
	public boolean getFunctionsNeverReturnBlobs() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getGatherPerfMetrics()
	 */
	public boolean getGatherPerfMetrics() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getGatherPerformanceMetrics()
	 */
	public boolean getGatherPerformanceMetrics() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getGenerateSimpleParameterMetadata()
	 */
	public boolean getGenerateSimpleParameterMetadata() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getGetProceduresReturnsFunctions()
	 */
	public boolean getGetProceduresReturnsFunctions() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getHoldResultsOpenOverStatementClose()
	 */
	public boolean getHoldResultsOpenOverStatementClose() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getIgnoreNonTxTables()
	 */
	public boolean getIgnoreNonTxTables() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getIncludeInnodbStatusInDeadlockExceptions()
	 */
	public boolean getIncludeInnodbStatusInDeadlockExceptions() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getIncludeThreadDumpInDeadlockExceptions()
	 */
	public boolean getIncludeThreadDumpInDeadlockExceptions() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getIncludeThreadNamesAsStatementComment()
	 */
	public boolean getIncludeThreadNamesAsStatementComment() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getInitialTimeout()
	 */
	public int getInitialTimeout() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getInteractiveClient()
	 */
	public boolean getInteractiveClient() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getIsInteractiveClient()
	 */
	public boolean getIsInteractiveClient() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getJdbcCompliantTruncation()
	 */
	public boolean getJdbcCompliantTruncation() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getJdbcCompliantTruncationForReads()
	 */
	public boolean getJdbcCompliantTruncationForReads() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLargeRowSizeThreshold()
	 */
	public String getLargeRowSizeThreshold() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLoadBalanceAutoCommitStatementRegex()
	 */
	public String getLoadBalanceAutoCommitStatementRegex() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLoadBalanceAutoCommitStatementThreshold()
	 */
	public int getLoadBalanceAutoCommitStatementThreshold() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLoadBalanceBlacklistTimeout()
	 */
	public int getLoadBalanceBlacklistTimeout() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLoadBalanceConnectionGroup()
	 */
	public String getLoadBalanceConnectionGroup() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLoadBalanceEnableJMX()
	 */
	public boolean getLoadBalanceEnableJMX() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLoadBalanceExceptionChecker()
	 */
	public String getLoadBalanceExceptionChecker() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLoadBalancePingTimeout()
	 */
	public int getLoadBalancePingTimeout() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLoadBalanceSQLExceptionSubclassFailover()
	 */
	public String getLoadBalanceSQLExceptionSubclassFailover() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLoadBalanceSQLStateFailover()
	 */
	public String getLoadBalanceSQLStateFailover() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLoadBalanceStrategy()
	 */
	public String getLoadBalanceStrategy() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLoadBalanceValidateConnectionOnSwapServer()
	 */
	public boolean getLoadBalanceValidateConnectionOnSwapServer() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLocalSocketAddress()
	 */
	public String getLocalSocketAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLocatorFetchBufferSize()
	 */
	public int getLocatorFetchBufferSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLogSlowQueries()
	 */
	public boolean getLogSlowQueries() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLogXaCommands()
	 */
	public boolean getLogXaCommands() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLogger()
	 */
	public String getLogger() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLoggerClassName()
	 */
	public String getLoggerClassName() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getMaintainTimeStats()
	 */
	public boolean getMaintainTimeStats() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getMaxAllowedPacket()
	 */
	public int getMaxAllowedPacket() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getMaxQuerySizeToLog()
	 */
	public int getMaxQuerySizeToLog() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getMaxReconnects()
	 */
	public int getMaxReconnects() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getMaxRows()
	 */
	public int getMaxRows() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getMetadataCacheSize()
	 */
	public int getMetadataCacheSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getNetTimeoutForStreamingResults()
	 */
	public int getNetTimeoutForStreamingResults() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getNoAccessToProcedureBodies()
	 */
	public boolean getNoAccessToProcedureBodies() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getNoDatetimeStringSync()
	 */
	public boolean getNoDatetimeStringSync() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getNoTimezoneConversionForTimeType()
	 */
	public boolean getNoTimezoneConversionForTimeType() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getNullCatalogMeansCurrent()
	 */
	public boolean getNullCatalogMeansCurrent() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getNullNamePatternMatchesAll()
	 */
	public boolean getNullNamePatternMatchesAll() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getOverrideSupportsIntegrityEnhancementFacility()
	 */
	public boolean getOverrideSupportsIntegrityEnhancementFacility() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getPacketDebugBufferSize()
	 */
	public int getPacketDebugBufferSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getPadCharsWithSpace()
	 */
	public boolean getPadCharsWithSpace() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getParanoid()
	 */
	public boolean getParanoid() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getParseInfoCacheFactory()
	 */
	public String getParseInfoCacheFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getPasswordCharacterEncoding()
	 */
	public String getPasswordCharacterEncoding() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getPedantic()
	 */
	public boolean getPedantic() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getPinGlobalTxToPhysicalConnection()
	 */
	public boolean getPinGlobalTxToPhysicalConnection() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getPopulateInsertRowWithDefaultValues()
	 */
	public boolean getPopulateInsertRowWithDefaultValues() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getPrepStmtCacheSize()
	 */
	public int getPrepStmtCacheSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getPrepStmtCacheSqlLimit()
	 */
	public int getPrepStmtCacheSqlLimit() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getPreparedStatementCacheSize()
	 */
	public int getPreparedStatementCacheSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getPreparedStatementCacheSqlLimit()
	 */
	public int getPreparedStatementCacheSqlLimit() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getProcessEscapeCodesForPrepStmts()
	 */
	public boolean getProcessEscapeCodesForPrepStmts() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getProfileSQL()
	 */
	public boolean getProfileSQL() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getProfileSql()
	 */
	public boolean getProfileSql() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getProfilerEventHandler()
	 */
	public String getProfilerEventHandler() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getPropertiesTransform()
	 */
	public String getPropertiesTransform() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getQueriesBeforeRetryMaster()
	 */
	public int getQueriesBeforeRetryMaster() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getQueryTimeoutKillsConnection()
	 */
	public boolean getQueryTimeoutKillsConnection() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getReconnectAtTxEnd()
	 */
	public boolean getReconnectAtTxEnd() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getRelaxAutoCommit()
	 */
	public boolean getRelaxAutoCommit() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getReplicationEnableJMX()
	 */
	public boolean getReplicationEnableJMX() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getReportMetricsIntervalMillis()
	 */
	public int getReportMetricsIntervalMillis() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getRequireSSL()
	 */
	public boolean getRequireSSL() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getResourceId()
	 */
	public String getResourceId() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getResultSetSizeThreshold()
	 */
	public int getResultSetSizeThreshold() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getRetainStatementAfterResultSetClose()
	 */
	public boolean getRetainStatementAfterResultSetClose() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getRetriesAllDown()
	 */
	public int getRetriesAllDown() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getRewriteBatchedStatements()
	 */
	public boolean getRewriteBatchedStatements() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getRollbackOnPooledClose()
	 */
	public boolean getRollbackOnPooledClose() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getRoundRobinLoadBalance()
	 */
	public boolean getRoundRobinLoadBalance() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getRunningCTS13()
	 */
	public boolean getRunningCTS13() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getSecondsBeforeRetryMaster()
	 */
	public int getSecondsBeforeRetryMaster() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getSelfDestructOnPingMaxOperations()
	 */
	public int getSelfDestructOnPingMaxOperations() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getSelfDestructOnPingSecondsLifetime()
	 */
	public int getSelfDestructOnPingSecondsLifetime() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getServerConfigCacheFactory()
	 */
	public String getServerConfigCacheFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getServerTimezone()
	 */
	public String getServerTimezone() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getSessionVariables()
	 */
	public String getSessionVariables() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getSlowQueryThresholdMillis()
	 */
	public int getSlowQueryThresholdMillis() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getSlowQueryThresholdNanos()
	 */
	public long getSlowQueryThresholdNanos() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getSocketFactory()
	 */
	public String getSocketFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getSocketFactoryClassName()
	 */
	public String getSocketFactoryClassName() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getSocketTimeout()
	 */
	public int getSocketTimeout() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getStatementInterceptors()
	 */
	public String getStatementInterceptors() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getStrictFloatingPoint()
	 */
	public boolean getStrictFloatingPoint() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getStrictUpdates()
	 */
	public boolean getStrictUpdates() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getTcpKeepAlive()
	 */
	public boolean getTcpKeepAlive() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getTcpNoDelay()
	 */
	public boolean getTcpNoDelay() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getTcpRcvBuf()
	 */
	public int getTcpRcvBuf() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getTcpSndBuf()
	 */
	public int getTcpSndBuf() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getTcpTrafficClass()
	 */
	public int getTcpTrafficClass() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getTinyInt1isBit()
	 */
	public boolean getTinyInt1isBit() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getTraceProtocol()
	 */
	public boolean getTraceProtocol() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getTransformedBitIsBoolean()
	 */
	public boolean getTransformedBitIsBoolean() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getTreatUtilDateAsTimestamp()
	 */
	public boolean getTreatUtilDateAsTimestamp() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getTrustCertificateKeyStorePassword()
	 */
	public String getTrustCertificateKeyStorePassword() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getTrustCertificateKeyStoreType()
	 */
	public String getTrustCertificateKeyStoreType() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getTrustCertificateKeyStoreUrl()
	 */
	public String getTrustCertificateKeyStoreUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUltraDevHack()
	 */
	public boolean getUltraDevHack() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseAffectedRows()
	 */
	public boolean getUseAffectedRows() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseBlobToStoreUTF8OutsideBMP()
	 */
	public boolean getUseBlobToStoreUTF8OutsideBMP() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseColumnNamesInFindColumn()
	 */
	public boolean getUseColumnNamesInFindColumn() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseCompression()
	 */
	public boolean getUseCompression() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseConfigs()
	 */
	public String getUseConfigs() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseCursorFetch()
	 */
	public boolean getUseCursorFetch() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseDirectRowUnpack()
	 */
	public boolean getUseDirectRowUnpack() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseDynamicCharsetInfo()
	 */
	public boolean getUseDynamicCharsetInfo() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseFastDateParsing()
	 */
	public boolean getUseFastDateParsing() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseFastIntParsing()
	 */
	public boolean getUseFastIntParsing() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseGmtMillisForDatetimes()
	 */
	public boolean getUseGmtMillisForDatetimes() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseHostsInPrivileges()
	 */
	public boolean getUseHostsInPrivileges() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseInformationSchema()
	 */
	public boolean getUseInformationSchema() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseJDBCCompliantTimezoneShift()
	 */
	public boolean getUseJDBCCompliantTimezoneShift() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseJvmCharsetConverters()
	 */
	public boolean getUseJvmCharsetConverters() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseLegacyDatetimeCode()
	 */
	public boolean getUseLegacyDatetimeCode() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseLocalSessionState()
	 */
	public boolean getUseLocalSessionState() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseLocalTransactionState()
	 */
	public boolean getUseLocalTransactionState() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseNanosForElapsedTime()
	 */
	public boolean getUseNanosForElapsedTime() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseOldAliasMetadataBehavior()
	 */
	public boolean getUseOldAliasMetadataBehavior() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseOldUTF8Behavior()
	 */
	public boolean getUseOldUTF8Behavior() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseOnlyServerErrorMessages()
	 */
	public boolean getUseOnlyServerErrorMessages() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseReadAheadInput()
	 */
	public boolean getUseReadAheadInput() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseSSL()
	 */
	public boolean getUseSSL() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseSSPSCompatibleTimezoneShift()
	 */
	public boolean getUseSSPSCompatibleTimezoneShift() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseServerPrepStmts()
	 */
	public boolean getUseServerPrepStmts() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseServerPreparedStmts()
	 */
	public boolean getUseServerPreparedStmts() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseSqlStateCodes()
	 */
	public boolean getUseSqlStateCodes() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseStreamLengthsInPrepStmts()
	 */
	public boolean getUseStreamLengthsInPrepStmts() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseTimezone()
	 */
	public boolean getUseTimezone() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseUltraDevWorkAround()
	 */
	public boolean getUseUltraDevWorkAround() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseUnbufferedInput()
	 */
	public boolean getUseUnbufferedInput() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseUnicode()
	 */
	public boolean getUseUnicode() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseUsageAdvisor()
	 */
	public boolean getUseUsageAdvisor() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUtf8OutsideBmpExcludedColumnNamePattern()
	 */
	public String getUtf8OutsideBmpExcludedColumnNamePattern() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUtf8OutsideBmpIncludedColumnNamePattern()
	 */
	public String getUtf8OutsideBmpIncludedColumnNamePattern() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getVerifyServerCertificate()
	 */
	public boolean getVerifyServerCertificate() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getYearIsDateType()
	 */
	public boolean getYearIsDateType() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getZeroDateTimeBehavior()
	 */
	public String getZeroDateTimeBehavior() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setAllowLoadLocalInfile(boolean)
	 */
	public void setAllowLoadLocalInfile(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setAllowMasterDownConnections(boolean)
	 */
	public void setAllowMasterDownConnections(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setAllowMultiQueries(boolean)
	 */
	public void setAllowMultiQueries(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setAllowNanAndInf(boolean)
	 */
	public void setAllowNanAndInf(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setAllowUrlInLocalInfile(boolean)
	 */
	public void setAllowUrlInLocalInfile(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setAlwaysSendSetIsolation(boolean)
	 */
	public void setAlwaysSendSetIsolation(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setAuthenticationPlugins(java.lang.String)
	 */
	public void setAuthenticationPlugins(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setAutoClosePStmtStreams(boolean)
	 */
	public void setAutoClosePStmtStreams(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setAutoDeserialize(boolean)
	 */
	public void setAutoDeserialize(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setAutoGenerateTestcaseScript(boolean)
	 */
	public void setAutoGenerateTestcaseScript(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setAutoReconnect(boolean)
	 */
	public void setAutoReconnect(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setAutoReconnectForConnectionPools(boolean)
	 */
	public void setAutoReconnectForConnectionPools(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setAutoReconnectForPools(boolean)
	 */
	public void setAutoReconnectForPools(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setAutoSlowLog(boolean)
	 */
	public void setAutoSlowLog(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setBlobSendChunkSize(java.lang.String)
	 */
	public void setBlobSendChunkSize(String arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setBlobsAreStrings(boolean)
	 */
	public void setBlobsAreStrings(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setCacheCallableStatements(boolean)
	 */
	public void setCacheCallableStatements(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setCacheCallableStmts(boolean)
	 */
	public void setCacheCallableStmts(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setCachePrepStmts(boolean)
	 */
	public void setCachePrepStmts(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setCachePreparedStatements(boolean)
	 */
	public void setCachePreparedStatements(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setCacheResultSetMetadata(boolean)
	 */
	public void setCacheResultSetMetadata(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setCacheServerConfiguration(boolean)
	 */
	public void setCacheServerConfiguration(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setCallableStatementCacheSize(int)
	 */
	public void setCallableStatementCacheSize(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setCallableStmtCacheSize(int)
	 */
	public void setCallableStmtCacheSize(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setCapitalizeDBMDTypes(boolean)
	 */
	public void setCapitalizeDBMDTypes(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setCapitalizeTypeNames(boolean)
	 */
	public void setCapitalizeTypeNames(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setCharacterEncoding(java.lang.String)
	 */
	public void setCharacterEncoding(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setCharacterSetResults(java.lang.String)
	 */
	public void setCharacterSetResults(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setClientCertificateKeyStorePassword(java.lang.String)
	 */
	public void setClientCertificateKeyStorePassword(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setClientCertificateKeyStoreType(java.lang.String)
	 */
	public void setClientCertificateKeyStoreType(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setClientCertificateKeyStoreUrl(java.lang.String)
	 */
	public void setClientCertificateKeyStoreUrl(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setClientInfoProvider(java.lang.String)
	 */
	public void setClientInfoProvider(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setClobCharacterEncoding(java.lang.String)
	 */
	public void setClobCharacterEncoding(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setClobberStreamingResults(boolean)
	 */
	public void setClobberStreamingResults(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setCompensateOnDuplicateKeyUpdateCounts(boolean)
	 */
	public void setCompensateOnDuplicateKeyUpdateCounts(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setConnectTimeout(int)
	 */
	public void setConnectTimeout(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setConnectionCollation(java.lang.String)
	 */
	public void setConnectionCollation(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setConnectionLifecycleInterceptors(java.lang.String)
	 */
	public void setConnectionLifecycleInterceptors(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setContinueBatchOnError(boolean)
	 */
	public void setContinueBatchOnError(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setCreateDatabaseIfNotExist(boolean)
	 */
	public void setCreateDatabaseIfNotExist(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setDefaultAuthenticationPlugin(java.lang.String)
	 */
	public void setDefaultAuthenticationPlugin(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setDefaultFetchSize(int)
	 */
	public void setDefaultFetchSize(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setDetectServerPreparedStmts(boolean)
	 */
	public void setDetectServerPreparedStmts(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setDisabledAuthenticationPlugins(java.lang.String)
	 */
	public void setDisabledAuthenticationPlugins(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setDisconnectOnExpiredPasswords(boolean)
	 */
	public void setDisconnectOnExpiredPasswords(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setDontTrackOpenResources(boolean)
	 */
	public void setDontTrackOpenResources(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setDumpMetadataOnColumnNotFound(boolean)
	 */
	public void setDumpMetadataOnColumnNotFound(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setDumpQueriesOnException(boolean)
	 */
	public void setDumpQueriesOnException(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setDynamicCalendars(boolean)
	 */
	public void setDynamicCalendars(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setElideSetAutoCommits(boolean)
	 */
	public void setElideSetAutoCommits(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setEmptyStringsConvertToZero(boolean)
	 */
	public void setEmptyStringsConvertToZero(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setEmulateLocators(boolean)
	 */
	public void setEmulateLocators(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setEmulateUnsupportedPstmts(boolean)
	 */
	public void setEmulateUnsupportedPstmts(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setEnablePacketDebug(boolean)
	 */
	public void setEnablePacketDebug(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setEnableQueryTimeouts(boolean)
	 */
	public void setEnableQueryTimeouts(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setEncoding(java.lang.String)
	 */
	public void setEncoding(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setExceptionInterceptors(java.lang.String)
	 */
	public void setExceptionInterceptors(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setExplainSlowQueries(boolean)
	 */
	public void setExplainSlowQueries(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setFailOverReadOnly(boolean)
	 */
	public void setFailOverReadOnly(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setFunctionsNeverReturnBlobs(boolean)
	 */
	public void setFunctionsNeverReturnBlobs(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setGatherPerfMetrics(boolean)
	 */
	public void setGatherPerfMetrics(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setGatherPerformanceMetrics(boolean)
	 */
	public void setGatherPerformanceMetrics(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setGenerateSimpleParameterMetadata(boolean)
	 */
	public void setGenerateSimpleParameterMetadata(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setGetProceduresReturnsFunctions(boolean)
	 */
	public void setGetProceduresReturnsFunctions(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setHoldResultsOpenOverStatementClose(boolean)
	 */
	public void setHoldResultsOpenOverStatementClose(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setIgnoreNonTxTables(boolean)
	 */
	public void setIgnoreNonTxTables(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setIncludeInnodbStatusInDeadlockExceptions(boolean)
	 */
	public void setIncludeInnodbStatusInDeadlockExceptions(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setIncludeThreadDumpInDeadlockExceptions(boolean)
	 */
	public void setIncludeThreadDumpInDeadlockExceptions(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setIncludeThreadNamesAsStatementComment(boolean)
	 */
	public void setIncludeThreadNamesAsStatementComment(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setInitialTimeout(int)
	 */
	public void setInitialTimeout(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setInteractiveClient(boolean)
	 */
	public void setInteractiveClient(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setIsInteractiveClient(boolean)
	 */
	public void setIsInteractiveClient(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setJdbcCompliantTruncation(boolean)
	 */
	public void setJdbcCompliantTruncation(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setJdbcCompliantTruncationForReads(boolean)
	 */
	public void setJdbcCompliantTruncationForReads(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLargeRowSizeThreshold(java.lang.String)
	 */
	public void setLargeRowSizeThreshold(String arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLoadBalanceAutoCommitStatementRegex(java.lang.String)
	 */
	public void setLoadBalanceAutoCommitStatementRegex(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLoadBalanceAutoCommitStatementThreshold(int)
	 */
	public void setLoadBalanceAutoCommitStatementThreshold(int arg0)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLoadBalanceBlacklistTimeout(int)
	 */
	public void setLoadBalanceBlacklistTimeout(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLoadBalanceConnectionGroup(java.lang.String)
	 */
	public void setLoadBalanceConnectionGroup(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLoadBalanceEnableJMX(boolean)
	 */
	public void setLoadBalanceEnableJMX(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLoadBalanceExceptionChecker(java.lang.String)
	 */
	public void setLoadBalanceExceptionChecker(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLoadBalancePingTimeout(int)
	 */
	public void setLoadBalancePingTimeout(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLoadBalanceSQLExceptionSubclassFailover(java.lang.String)
	 */
	public void setLoadBalanceSQLExceptionSubclassFailover(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLoadBalanceSQLStateFailover(java.lang.String)
	 */
	public void setLoadBalanceSQLStateFailover(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLoadBalanceStrategy(java.lang.String)
	 */
	public void setLoadBalanceStrategy(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLoadBalanceValidateConnectionOnSwapServer(boolean)
	 */
	public void setLoadBalanceValidateConnectionOnSwapServer(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLocalSocketAddress(java.lang.String)
	 */
	public void setLocalSocketAddress(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLocatorFetchBufferSize(java.lang.String)
	 */
	public void setLocatorFetchBufferSize(String arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLogSlowQueries(boolean)
	 */
	public void setLogSlowQueries(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLogXaCommands(boolean)
	 */
	public void setLogXaCommands(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLogger(java.lang.String)
	 */
	public void setLogger(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLoggerClassName(java.lang.String)
	 */
	public void setLoggerClassName(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setMaintainTimeStats(boolean)
	 */
	public void setMaintainTimeStats(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setMaxQuerySizeToLog(int)
	 */
	public void setMaxQuerySizeToLog(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setMaxReconnects(int)
	 */
	public void setMaxReconnects(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setMaxRows(int)
	 */
	public void setMaxRows(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setMetadataCacheSize(int)
	 */
	public void setMetadataCacheSize(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setNetTimeoutForStreamingResults(int)
	 */
	public void setNetTimeoutForStreamingResults(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setNoAccessToProcedureBodies(boolean)
	 */
	public void setNoAccessToProcedureBodies(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setNoDatetimeStringSync(boolean)
	 */
	public void setNoDatetimeStringSync(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setNoTimezoneConversionForTimeType(boolean)
	 */
	public void setNoTimezoneConversionForTimeType(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setNullCatalogMeansCurrent(boolean)
	 */
	public void setNullCatalogMeansCurrent(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setNullNamePatternMatchesAll(boolean)
	 */
	public void setNullNamePatternMatchesAll(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setOverrideSupportsIntegrityEnhancementFacility(boolean)
	 */
	public void setOverrideSupportsIntegrityEnhancementFacility(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setPacketDebugBufferSize(int)
	 */
	public void setPacketDebugBufferSize(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setPadCharsWithSpace(boolean)
	 */
	public void setPadCharsWithSpace(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setParanoid(boolean)
	 */
	public void setParanoid(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setParseInfoCacheFactory(java.lang.String)
	 */
	public void setParseInfoCacheFactory(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setPasswordCharacterEncoding(java.lang.String)
	 */
	public void setPasswordCharacterEncoding(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setPedantic(boolean)
	 */
	public void setPedantic(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setPinGlobalTxToPhysicalConnection(boolean)
	 */
	public void setPinGlobalTxToPhysicalConnection(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setPopulateInsertRowWithDefaultValues(boolean)
	 */
	public void setPopulateInsertRowWithDefaultValues(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setPrepStmtCacheSize(int)
	 */
	public void setPrepStmtCacheSize(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setPrepStmtCacheSqlLimit(int)
	 */
	public void setPrepStmtCacheSqlLimit(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setPreparedStatementCacheSize(int)
	 */
	public void setPreparedStatementCacheSize(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setPreparedStatementCacheSqlLimit(int)
	 */
	public void setPreparedStatementCacheSqlLimit(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setProcessEscapeCodesForPrepStmts(boolean)
	 */
	public void setProcessEscapeCodesForPrepStmts(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setProfileSQL(boolean)
	 */
	public void setProfileSQL(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setProfileSql(boolean)
	 */
	public void setProfileSql(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setProfilerEventHandler(java.lang.String)
	 */
	public void setProfilerEventHandler(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setPropertiesTransform(java.lang.String)
	 */
	public void setPropertiesTransform(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setQueriesBeforeRetryMaster(int)
	 */
	public void setQueriesBeforeRetryMaster(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setQueryTimeoutKillsConnection(boolean)
	 */
	public void setQueryTimeoutKillsConnection(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setReconnectAtTxEnd(boolean)
	 */
	public void setReconnectAtTxEnd(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setRelaxAutoCommit(boolean)
	 */
	public void setRelaxAutoCommit(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setReplicationEnableJMX(boolean)
	 */
	public void setReplicationEnableJMX(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setReportMetricsIntervalMillis(int)
	 */
	public void setReportMetricsIntervalMillis(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setRequireSSL(boolean)
	 */
	public void setRequireSSL(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setResourceId(java.lang.String)
	 */
	public void setResourceId(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setResultSetSizeThreshold(int)
	 */
	public void setResultSetSizeThreshold(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setRetainStatementAfterResultSetClose(boolean)
	 */
	public void setRetainStatementAfterResultSetClose(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setRetriesAllDown(int)
	 */
	public void setRetriesAllDown(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setRewriteBatchedStatements(boolean)
	 */
	public void setRewriteBatchedStatements(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setRollbackOnPooledClose(boolean)
	 */
	public void setRollbackOnPooledClose(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setRoundRobinLoadBalance(boolean)
	 */
	public void setRoundRobinLoadBalance(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setRunningCTS13(boolean)
	 */
	public void setRunningCTS13(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setSecondsBeforeRetryMaster(int)
	 */
	public void setSecondsBeforeRetryMaster(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setSelfDestructOnPingMaxOperations(int)
	 */
	public void setSelfDestructOnPingMaxOperations(int arg0)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setSelfDestructOnPingSecondsLifetime(int)
	 */
	public void setSelfDestructOnPingSecondsLifetime(int arg0)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setServerConfigCacheFactory(java.lang.String)
	 */
	public void setServerConfigCacheFactory(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setServerTimezone(java.lang.String)
	 */
	public void setServerTimezone(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setSessionVariables(java.lang.String)
	 */
	public void setSessionVariables(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setSlowQueryThresholdMillis(int)
	 */
	public void setSlowQueryThresholdMillis(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setSlowQueryThresholdNanos(long)
	 */
	public void setSlowQueryThresholdNanos(long arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setSocketFactory(java.lang.String)
	 */
	public void setSocketFactory(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setSocketFactoryClassName(java.lang.String)
	 */
	public void setSocketFactoryClassName(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setSocketTimeout(int)
	 */
	public void setSocketTimeout(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setStatementInterceptors(java.lang.String)
	 */
	public void setStatementInterceptors(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setStrictFloatingPoint(boolean)
	 */
	public void setStrictFloatingPoint(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setStrictUpdates(boolean)
	 */
	public void setStrictUpdates(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setTcpKeepAlive(boolean)
	 */
	public void setTcpKeepAlive(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setTcpNoDelay(boolean)
	 */
	public void setTcpNoDelay(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setTcpRcvBuf(int)
	 */
	public void setTcpRcvBuf(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setTcpSndBuf(int)
	 */
	public void setTcpSndBuf(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setTcpTrafficClass(int)
	 */
	public void setTcpTrafficClass(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setTinyInt1isBit(boolean)
	 */
	public void setTinyInt1isBit(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setTraceProtocol(boolean)
	 */
	public void setTraceProtocol(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setTransformedBitIsBoolean(boolean)
	 */
	public void setTransformedBitIsBoolean(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setTreatUtilDateAsTimestamp(boolean)
	 */
	public void setTreatUtilDateAsTimestamp(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setTrustCertificateKeyStorePassword(java.lang.String)
	 */
	public void setTrustCertificateKeyStorePassword(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setTrustCertificateKeyStoreType(java.lang.String)
	 */
	public void setTrustCertificateKeyStoreType(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setTrustCertificateKeyStoreUrl(java.lang.String)
	 */
	public void setTrustCertificateKeyStoreUrl(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUltraDevHack(boolean)
	 */
	public void setUltraDevHack(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseAffectedRows(boolean)
	 */
	public void setUseAffectedRows(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseBlobToStoreUTF8OutsideBMP(boolean)
	 */
	public void setUseBlobToStoreUTF8OutsideBMP(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseColumnNamesInFindColumn(boolean)
	 */
	public void setUseColumnNamesInFindColumn(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseCompression(boolean)
	 */
	public void setUseCompression(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseConfigs(java.lang.String)
	 */
	public void setUseConfigs(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseCursorFetch(boolean)
	 */
	public void setUseCursorFetch(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseDirectRowUnpack(boolean)
	 */
	public void setUseDirectRowUnpack(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseDynamicCharsetInfo(boolean)
	 */
	public void setUseDynamicCharsetInfo(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseFastDateParsing(boolean)
	 */
	public void setUseFastDateParsing(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseFastIntParsing(boolean)
	 */
	public void setUseFastIntParsing(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseGmtMillisForDatetimes(boolean)
	 */
	public void setUseGmtMillisForDatetimes(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseHostsInPrivileges(boolean)
	 */
	public void setUseHostsInPrivileges(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseInformationSchema(boolean)
	 */
	public void setUseInformationSchema(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseJDBCCompliantTimezoneShift(boolean)
	 */
	public void setUseJDBCCompliantTimezoneShift(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseJvmCharsetConverters(boolean)
	 */
	public void setUseJvmCharsetConverters(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseLegacyDatetimeCode(boolean)
	 */
	public void setUseLegacyDatetimeCode(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseLocalSessionState(boolean)
	 */
	public void setUseLocalSessionState(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseLocalTransactionState(boolean)
	 */
	public void setUseLocalTransactionState(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseNanosForElapsedTime(boolean)
	 */
	public void setUseNanosForElapsedTime(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseOldAliasMetadataBehavior(boolean)
	 */
	public void setUseOldAliasMetadataBehavior(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseOldUTF8Behavior(boolean)
	 */
	public void setUseOldUTF8Behavior(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseOnlyServerErrorMessages(boolean)
	 */
	public void setUseOnlyServerErrorMessages(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseReadAheadInput(boolean)
	 */
	public void setUseReadAheadInput(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseSSL(boolean)
	 */
	public void setUseSSL(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseSSPSCompatibleTimezoneShift(boolean)
	 */
	public void setUseSSPSCompatibleTimezoneShift(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseServerPrepStmts(boolean)
	 */
	public void setUseServerPrepStmts(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseServerPreparedStmts(boolean)
	 */
	public void setUseServerPreparedStmts(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseSqlStateCodes(boolean)
	 */
	public void setUseSqlStateCodes(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseStreamLengthsInPrepStmts(boolean)
	 */
	public void setUseStreamLengthsInPrepStmts(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseTimezone(boolean)
	 */
	public void setUseTimezone(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseUltraDevWorkAround(boolean)
	 */
	public void setUseUltraDevWorkAround(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseUnbufferedInput(boolean)
	 */
	public void setUseUnbufferedInput(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseUnicode(boolean)
	 */
	public void setUseUnicode(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseUsageAdvisor(boolean)
	 */
	public void setUseUsageAdvisor(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUtf8OutsideBmpExcludedColumnNamePattern(java.lang.String)
	 */
	public void setUtf8OutsideBmpExcludedColumnNamePattern(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUtf8OutsideBmpIncludedColumnNamePattern(java.lang.String)
	 */
	public void setUtf8OutsideBmpIncludedColumnNamePattern(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setVerifyServerCertificate(boolean)
	 */
	public void setVerifyServerCertificate(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setYearIsDateType(boolean)
	 */
	public void setYearIsDateType(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setZeroDateTimeBehavior(java.lang.String)
	 */
	public void setZeroDateTimeBehavior(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#useUnbufferedInput()
	 */
	public boolean useUnbufferedInput() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#abort(java.util.concurrent.Executor)
	 */
	public void abort(Executor arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#abortInternal()
	 */
	public void abortInternal() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#changeUser(java.lang.String, java.lang.String)
	 */
	public void changeUser(String arg0, String arg1) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#checkClosed()
	 */
	public void checkClosed() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#clearHasTriedMaster()
	 */
	public void clearHasTriedMaster() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#clientPrepareStatement(java.lang.String)
	 */
	public PreparedStatement clientPrepareStatement(String arg0)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#clientPrepareStatement(java.lang.String, int)
	 */
	public PreparedStatement clientPrepareStatement(String arg0, int arg1)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#clientPrepareStatement(java.lang.String, int[])
	 */
	public PreparedStatement clientPrepareStatement(String arg0, int[] arg1)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#clientPrepareStatement(java.lang.String, java.lang.String[])
	 */
	public PreparedStatement clientPrepareStatement(String arg0, String[] arg1)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#clientPrepareStatement(java.lang.String, int, int)
	 */
	public PreparedStatement clientPrepareStatement(String arg0, int arg1,
			int arg2) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#clientPrepareStatement(java.lang.String, int, int, int)
	 */
	public PreparedStatement clientPrepareStatement(String arg0, int arg1,
			int arg2, int arg3) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#getActiveStatementCount()
	 */
	public int getActiveStatementCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#getAutoIncrementIncrement()
	 */
	public int getAutoIncrementIncrement() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#getConnectionMutex()
	 */
	public Object getConnectionMutex() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#getHost()
	 */
	public String getHost() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#getIdleFor()
	 */
	public long getIdleFor() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#getLog()
	 */
	public Log getLog() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#getNetworkTimeout()
	 */
	public int getNetworkTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#getProperties()
	 */
	public Properties getProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#getSchema()
	 */
	public String getSchema() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#getServerCharacterEncoding()
	 */
	public String getServerCharacterEncoding() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#getServerTimezoneTZ()
	 */
	public TimeZone getServerTimezoneTZ() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#getStatementComment()
	 */
	public String getStatementComment() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#hasSameProperties(com.mysql.jdbc.Connection)
	 */
	public boolean hasSameProperties(Connection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#hasTriedMaster()
	 */
	public boolean hasTriedMaster() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#initializeExtension(com.mysql.jdbc.Extension)
	 */
	public void initializeExtension(Extension arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#isAbonormallyLongQuery(long)
	 */
	public boolean isAbonormallyLongQuery(long arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#isInGlobalTx()
	 */
	public boolean isInGlobalTx() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#isMasterConnection()
	 */
	public boolean isMasterConnection() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#isNoBackslashEscapesSet()
	 */
	public boolean isNoBackslashEscapesSet() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#isSameResource(com.mysql.jdbc.Connection)
	 */
	public boolean isSameResource(Connection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#isServerLocal()
	 */
	public boolean isServerLocal() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#lowerCaseTableNames()
	 */
	public boolean lowerCaseTableNames() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#parserKnowsUnicode()
	 */
	public boolean parserKnowsUnicode() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#ping()
	 */
	public void ping() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#reportQueryTime(long)
	 */
	public void reportQueryTime(long arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#resetServerState()
	 */
	public void resetServerState() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#serverPrepareStatement(java.lang.String)
	 */
	public PreparedStatement serverPrepareStatement(String arg0)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#serverPrepareStatement(java.lang.String, int)
	 */
	public PreparedStatement serverPrepareStatement(String arg0, int arg1)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#serverPrepareStatement(java.lang.String, int[])
	 */
	public PreparedStatement serverPrepareStatement(String arg0, int[] arg1)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#serverPrepareStatement(java.lang.String, java.lang.String[])
	 */
	public PreparedStatement serverPrepareStatement(String arg0, String[] arg1)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#serverPrepareStatement(java.lang.String, int, int)
	 */
	public PreparedStatement serverPrepareStatement(String arg0, int arg1,
			int arg2) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#serverPrepareStatement(java.lang.String, int, int, int)
	 */
	public PreparedStatement serverPrepareStatement(String arg0, int arg1,
			int arg2, int arg3) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#setFailedOver(boolean)
	 */
	public void setFailedOver(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#setInGlobalTx(boolean)
	 */
	public void setInGlobalTx(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#setNetworkTimeout(java.util.concurrent.Executor, int)
	 */
	public void setNetworkTimeout(Executor arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#setPreferSlaveDuringFailover(boolean)
	 */
	public void setPreferSlaveDuringFailover(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#setProxy(com.mysql.jdbc.MySQLConnection)
	 */
	public void setProxy(MySQLConnection arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#setSchema(java.lang.String)
	 */
	public void setSchema(String arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#setStatementComment(java.lang.String)
	 */
	public void setStatementComment(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#shutdownServer()
	 */
	public void shutdownServer() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#supportsIsolationLevel()
	 */
	public boolean supportsIsolationLevel() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#supportsQuotedIdentifiers()
	 */
	public boolean supportsQuotedIdentifiers() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#supportsTransactions()
	 */
	public boolean supportsTransactions() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#versionMeetsMinimum(int, int, int)
	 */
	public boolean versionMeetsMinimum(int arg0, int arg1, int arg2)
			throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
