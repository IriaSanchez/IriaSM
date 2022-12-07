namespace WFExamen
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
            this.listBox1 = new System.Windows.Forms.ListBox();
            this.cbMañana = new System.Windows.Forms.CheckBox();
            this.cbTarde = new System.Windows.Forms.CheckBox();
            this.cbNoche = new System.Windows.Forms.CheckBox();
            this.btAñadir = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // listBox1
            // 
            this.listBox1.FormattingEnabled = true;
            this.listBox1.Location = new System.Drawing.Point(189, 41);
            this.listBox1.Name = "listBox1";
            this.listBox1.Size = new System.Drawing.Size(237, 43);
            this.listBox1.TabIndex = 0;
            // 
            // cbMañana
            // 
            this.cbMañana.AutoSize = true;
            this.cbMañana.Location = new System.Drawing.Point(189, 100);
            this.cbMañana.Name = "cbMañana";
            this.cbMañana.Size = new System.Drawing.Size(65, 17);
            this.cbMañana.TabIndex = 1;
            this.cbMañana.Text = "Mañana";
            this.cbMañana.UseVisualStyleBackColor = true;
            // 
            // cbTarde
            // 
            this.cbTarde.AutoSize = true;
            this.cbTarde.Location = new System.Drawing.Point(275, 100);
            this.cbTarde.Name = "cbTarde";
            this.cbTarde.Size = new System.Drawing.Size(54, 17);
            this.cbTarde.TabIndex = 2;
            this.cbTarde.Text = "Tarde";
            this.cbTarde.UseVisualStyleBackColor = true;
            // 
            // cbNoche
            // 
            this.cbNoche.AutoSize = true;
            this.cbNoche.Location = new System.Drawing.Point(368, 100);
            this.cbNoche.Name = "cbNoche";
            this.cbNoche.Size = new System.Drawing.Size(58, 17);
            this.cbNoche.TabIndex = 3;
            this.cbNoche.Text = "Noche";
            this.cbNoche.UseVisualStyleBackColor = true;
            // 
            // btAñadir
            // 
            this.btAñadir.Location = new System.Drawing.Point(243, 147);
            this.btAñadir.Name = "btAñadir";
            this.btAñadir.Size = new System.Drawing.Size(140, 23);
            this.btAñadir.TabIndex = 4;
            this.btAñadir.Text = "AÑADIR";
            this.btAñadir.UseVisualStyleBackColor = true;
            this.btAñadir.Click += new System.EventHandler(this.btAñadir_Click);
            // 
            // FParte2
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.btAñadir);
            this.Controls.Add(this.cbNoche);
            this.Controls.Add(this.cbTarde);
            this.Controls.Add(this.cbMañana);
            this.Controls.Add(this.listBox1);
            this.Name = "FParte2";
            this.Text = "FParte2";
            this.Load += new System.EventHandler(this.FParte2_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ListBox listBox1;
        private System.Windows.Forms.CheckBox cbMañana;
        private System.Windows.Forms.CheckBox cbTarde;
        private System.Windows.Forms.CheckBox cbNoche;
        private System.Windows.Forms.Button btAñadir;
    }
}