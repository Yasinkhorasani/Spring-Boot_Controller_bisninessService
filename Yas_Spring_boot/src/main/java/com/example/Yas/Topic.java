package com.example.Yas;

public class Topic {

		private String id;
		private String name;
		private String descriptien;
		
		public Topic() {
			
		}
		/**
		 * @param id
		 * @param name
		 * @param descriptien
		 */
		public Topic(String id, String name, String descriptien) {
			super();
			this.id = id;
			this.name = name;
			this.descriptien = descriptien;
		}
		/**
		 * @return the id
		 */
		public String getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(String id) {
			this.id = id;
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @return the descriptien
		 */
		public String getDescriptien() {
			return descriptien;
		}
		/**
		 * @param descriptien the descriptien to set
		 */
		public void setDescriptien(String descriptien) {
			this.descriptien = descriptien;
		}
}
