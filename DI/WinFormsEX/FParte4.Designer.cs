namespace WinFormsEX
{
    partial class FParte4
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
            this.comboBox1 = new System.Windows.Forms.ComboBox();
            this.comboBox2 = new System.Windows.Forms.ComboBox();
            this.cbCastellano = new System.Windows.Forms.CheckBox();
            this.cbIngles = new System.Windows.Forms.CheckBox();
            this.btMostrar = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // comboBox1
            // 
            this.comboBox1.FormattingEnabled = true;
            this.comboBox1.Items.AddRange(new object[] {
            "Avenida",
            "Plaza",
            "Calle"});
            this.comboBox1.Location = new System.Drawing.Point(169, 196);
            this.comboBox1.Name = "comboBox1";
            this.comboBox1.Size = new System.Drawing.Size(121, 21);
            this.comboBox1.TabIndex = 0;
            // 
            // comboBox2
            // 
            this.comboBox2.FormattingEnabled = true;
            this.comboBox2.Items.AddRange(new object[] {
            "Alfonso Molina",
            "Cormelana",
            "Agra del Orzán"});
            this.comboBox2.Location = new System.Drawing.Point(336, 196);
            this.comboBox2.Name = "comboBox2";
            this.comboBox2.Size = new System.Drawing.Size(121, 21);
            this.comboBox2.TabIndex = 1;
            // 
            // cbCastellano
            // 
            this.cbCastellano.AutoSize = true;
            this.cbCastellano.Location = new System.Drawing.Point(210, 150);
            this.cbCastellano.Name = "cbCastellano";
            this.cbCastellano.Size = new System.Drawing.Size(75, 17);
            this.cbCastellano.TabIndex = 2;
            this.cbCastellano.Text = "Castellano";
            this.cbCastellano.UseVisualStyleBackColor = true;
            this.cbCastellano.CheckedChanged += new System.EventHandler(this.cbCastellano_CheckedChanged);
            // 
            // cbIngles
            // 
            this.cbIngles.AutoSize = true;
            this.cbIngles.Location = new System.Drawing.Point(336, 150);
            this.cbIngles.Name = "cbIngles";
            this.cbIngles.Size = new System.Drawing.Size(54, 17);
            this.cbIngles.TabIndex = 3;
            this.cbIngles.Text = "Inglés";
            this.cbIngles.UseVisualStyleBackColor = true;
            // 
            // btMostrar
            // 
            this.btMostrar.Location = new System.Drawing.Point(275, 240);
            this.btMostrar.Name = "btMostrar";
            this.btMostrar.Size = new System.Drawing.Size(75, 23);
            this.btMostrar.TabIndex = 4;
            this.btMostrar.Text = "Mostrar";
            this.btMostrar.UseVisualStyleBackColor = true;
            // 
            // FParte4
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.btMostrar);
            this.Controls.Add(this.cbIngles);
            this.Controls.Add(this.cbCastellano);
            this.Controls.Add(this.comboBox2);
            this.Controls.Add(this.comboBox1);
            this.Name = "FParte4";
            this.Text = "FParte4";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ComboBox comboBox1;
        private System.Windows.Forms.ComboBox comboBox2;
        private System.Windows.Forms.CheckBox cbCastellano;
        private System.Windows.Forms.CheckBox cbIngles;
        private System.Windows.Forms.Button btMostrar;
    }
}