namespace WFEjercicios
{
    partial class Ejercicio4
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
            this.cbMusica = new System.Windows.Forms.ComboBox();
            this.lbMusica = new System.Windows.Forms.ListBox();
            this.SuspendLayout();
            // 
            // cbMusica
            // 
            this.cbMusica.FormattingEnabled = true;
            this.cbMusica.Items.AddRange(new object[] {
            "Clásica",
            "Pop",
            "Electrónica"});
            this.cbMusica.Location = new System.Drawing.Point(12, 22);
            this.cbMusica.Name = "cbMusica";
            this.cbMusica.Size = new System.Drawing.Size(121, 21);
            this.cbMusica.TabIndex = 0;
            this.cbMusica.SelectedIndexChanged += new System.EventHandler(this.cbMusica_SelectedIndexChanged);
            // 
            // lbMusica
            // 
            this.lbMusica.Cursor = System.Windows.Forms.Cursors.Default;
            this.lbMusica.FormattingEnabled = true;
            this.lbMusica.Location = new System.Drawing.Point(13, 66);
            this.lbMusica.Name = "lbMusica";
            this.lbMusica.Size = new System.Drawing.Size(120, 95);
            this.lbMusica.TabIndex = 1;
            this.lbMusica.SelectedIndexChanged += new System.EventHandler(this.lbMusica_SelectedIndexChanged);
            // 
            // Ejercicio4
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.lbMusica);
            this.Controls.Add(this.cbMusica);
            this.Name = "Ejercicio4";
            this.Text = "Ejercicio4";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.ComboBox cbMusica;
        private System.Windows.Forms.ListBox lbMusica;
    }
}