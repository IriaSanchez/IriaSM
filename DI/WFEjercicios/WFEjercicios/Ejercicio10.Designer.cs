namespace WFEjercicios
{
    partial class Ejercicio10
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
            this.lbIdioma = new System.Windows.Forms.Label();
            this.btIdioma = new System.Windows.Forms.Button();
            this.cbIdiomas = new System.Windows.Forms.ComboBox();
            this.SuspendLayout();
            // 
            // lbIdioma
            // 
            this.lbIdioma.AutoSize = true;
            this.lbIdioma.BackColor = System.Drawing.SystemColors.MenuHighlight;
            this.lbIdioma.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.lbIdioma.Cursor = System.Windows.Forms.Cursors.No;
            this.lbIdioma.Enabled = false;
            this.lbIdioma.Font = new System.Drawing.Font("Microsoft Sans Serif", 15F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbIdioma.ForeColor = System.Drawing.SystemColors.ControlText;
            this.lbIdioma.Location = new System.Drawing.Point(215, 218);
            this.lbIdioma.Name = "lbIdioma";
            this.lbIdioma.Size = new System.Drawing.Size(78, 27);
            this.lbIdioma.TabIndex = 0;
            this.lbIdioma.Text = "Idioma";
            this.lbIdioma.Click += new System.EventHandler(this.lbIdioma_Click);
            // 
            // btIdioma
            // 
            this.btIdioma.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(224)))), ((int)(((byte)(192)))));
            this.btIdioma.Font = new System.Drawing.Font("Microsoft Sans Serif", 15F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btIdioma.Location = new System.Drawing.Point(341, 266);
            this.btIdioma.Name = "btIdioma";
            this.btIdioma.Size = new System.Drawing.Size(121, 39);
            this.btIdioma.TabIndex = 1;
            this.btIdioma.TabStop = false;
            this.btIdioma.Text = "Saludar";
            this.btIdioma.UseVisualStyleBackColor = false;
            this.btIdioma.Click += new System.EventHandler(this.btIdioma_Click);
            // 
            // cbIdiomas
            // 
            this.cbIdiomas.FormattingEnabled = true;
            this.cbIdiomas.Items.AddRange(new object[] {
            "Español",
            "Inglés"});
            this.cbIdiomas.Location = new System.Drawing.Point(341, 218);
            this.cbIdiomas.Name = "cbIdiomas";
            this.cbIdiomas.Size = new System.Drawing.Size(121, 21);
            this.cbIdiomas.TabIndex = 2;
            this.cbIdiomas.SelectedIndexChanged += new System.EventHandler(this.cbIdiomas_SelectedIndexChanged);
            // 
            // Ejercicio10
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.cbIdiomas);
            this.Controls.Add(this.btIdioma);
            this.Controls.Add(this.lbIdioma);
            this.Name = "Ejercicio10";
            this.Text = "Ejercicio10";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lbIdioma;
        private System.Windows.Forms.Button btIdioma;
        private System.Windows.Forms.ComboBox cbIdiomas;
    }
}