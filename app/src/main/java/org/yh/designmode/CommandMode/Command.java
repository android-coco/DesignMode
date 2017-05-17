package org.yh.designmode.CommandMode;

public interface Command {
	/**
	 * * 执行命令
	 */
	public void execute();

	/**
	 * 撤销命令
	 */
	public void undo();
}
