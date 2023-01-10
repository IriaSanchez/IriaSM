namespace WinFormsEX
{
    partial class FParte2
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.gbPrenda = new System.Windows.Forms.GroupBox();
            this.rbSombrero = new System.Windows.Forms.RadioButton();
            this.rbPantalon = new System.Windows.Forms.RadioButton();
            this.lbColor = new System.Windows.Forms.ListBox();
            this.btRegistrar = new System.Windows.Forms.Button();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.gbPrenda.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            this.SuspendLayout();
            // 
            // gbPrenda
            // 
            this.gbPrenda.Controls.Add(this.rbPantalon);
            this.gbPrenda.Controls.Add(this.rbSombrero);
            this.gbPrenda.Location = new System.Drawing.Point(12, 12);
            this.gbPrenda.Name = "gbPrenda";
            this.gbPrenda.Size = new System.Drawing.Size(130, 100);
            this.gbPrenda.TabIndex = 0;
            this.gbPrenda.TabStop = false;
            this.gbPrenda.Text = "Prenda";
            // 
            // rbSombrero
            // 
            this.rbSombrero.AutoSize = true;
            this.rbSombrero.Location = new System.Drawing.Point(6, 31);
            this.rbSombrero.Name = "rbSombrero";
            this.rbSombrero.Size = new System.Drawing.Size(70, 17);
            this.rbSombrero.TabIndex = 0;
            this.rbSombrero.TabStop = true;
            this.rbSombrero.Text = "Sombrero";
            this.rbSombrero.UseVisualStyleBackColor = true;
            // 
            // rbPantalon
            // 
            this.rbPantalon.AutoSize = true;
            this.rbPantalon.Location = new System.Drawing.Point(9, 64);
            this.rbPantalon.Name = "rbPantalon";
            this.rbPantalon.Size = new System.Drawing.Size(67, 17);
            this.rbPantalon.TabIndex = 1;
            this.rbPantalon.TabStop = true;
            this.rbPantalon.Text = "Pantalón";
            this.rbPantalon.UseVisualStyleBackColor = true;
            // 
            // lbColor
            // 
            this.lbColor.FormattingEnabled = true;
            this.lbColor.Items.AddRange(new object[] {
            "Azul",
            "Verde",
            "Amarillo"});
            this.lbColor.Location = new System.Drawing.Point(12, 132);
            this.lbColor.Name = "lbColor";
            this.lbColor.Size = new System.Drawing.Size(120, 95);
            this.lbColor.TabIndex = 1;
            // 
            // btRegistrar
            // 
            this.btRegistrar.Location = new System.Drawing.Point(57, 255);
            this.btRegistrar.Name = "btRegistrar";
            this.btRegistrar.Size = new System.Drawing.Size(75, 23);
            this.btRegistrar.TabIndex = 2;
            this.btRegistrar.Text = "Registrar";
            this.btRegistrar.UseVisualStyleBackColor = true;
            this.btRegistrar.Click += new System.EventHandler(this.btRegistrar_Click);
            // 
            // dataGridView1
            // 
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Location = new System.Drawing.Point(173, 12);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.Size = new System.Drawing.Size(456, 266);
            this.dataGridView1.TabIndex = 3;
            // 
            // FParte2
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.dataGridView1);
            this.Controls.Add(this.btRegistrar);
            this.Controls.Add(this.lbColor);
            this.Controls.Add(this.gbPrenda);
            this.Name = "FParte2";
            this.Text = "FParte2";
            this.gbPrenda.ResumeLayout(false);
            this.gbPrenda.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.GroupBox gbPrenda;
        private System.Windows.Forms.RadioButton rbPantalon;
        private System.Windows.Forms.RadioButton rbSombrero;
        private System.Windows.Forms.ListBox lbColor;
        private System.Windows.Forms.Button btRegistrar;
        private System.Windows.Forms.DataGridView dataGridView1;
    }
}