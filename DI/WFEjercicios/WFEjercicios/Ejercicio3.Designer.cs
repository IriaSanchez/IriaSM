namespace WFEjercicios
{
    partial class Ejercicio3
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
            this.gbMarca = new System.Windows.Forms.GroupBox();
            this.gbColor = new System.Windows.Forms.GroupBox();
            this.rbFiat = new System.Windows.Forms.RadioButton();
            this.rbFerrari = new System.Windows.Forms.RadioButton();
            this.rbSeat = new System.Windows.Forms.RadioButton();
            this.rbRojo = new System.Windows.Forms.RadioButton();
            this.rbNegro = new System.Windows.Forms.RadioButton();
            this.rbBlanco = new System.Windows.Forms.RadioButton();
            this.pbCoches = new System.Windows.Forms.PictureBox();
            this.gbMarca.SuspendLayout();
            this.gbColor.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pbCoches)).BeginInit();
            this.SuspendLayout();
            // 
            // gbMarca
            // 
            this.gbMarca.Controls.Add(this.rbSeat);
            this.gbMarca.Controls.Add(this.rbFerrari);
            this.gbMarca.Controls.Add(this.rbFiat);
            this.gbMarca.Location = new System.Drawing.Point(170, 70);
            this.gbMarca.Name = "gbMarca";
            this.gbMarca.Size = new System.Drawing.Size(200, 100);
            this.gbMarca.TabIndex = 4;
            this.gbMarca.TabStop = false;
            this.gbMarca.Text = "Elegir marca";
            // 
            // gbColor
            // 
            this.gbColor.Controls.Add(this.rbBlanco);
            this.gbColor.Controls.Add(this.rbNegro);
            this.gbColor.Controls.Add(this.rbRojo);
            this.gbColor.Location = new System.Drawing.Point(387, 70);
            this.gbColor.Name = "gbColor";
            this.gbColor.Size = new System.Drawing.Size(200, 100);
            this.gbColor.TabIndex = 5;
            this.gbColor.TabStop = false;
            this.gbColor.Text = "Elegir color";
            // 
            // rbFiat
            // 
            this.rbFiat.AutoSize = true;
            this.rbFiat.Location = new System.Drawing.Point(6, 19);
            this.rbFiat.Name = "rbFiat";
            this.rbFiat.Size = new System.Drawing.Size(42, 17);
            this.rbFiat.TabIndex = 0;
            this.rbFiat.TabStop = true;
            this.rbFiat.Text = "Fiat";
            this.rbFiat.UseVisualStyleBackColor = true;
            this.rbFiat.CheckedChanged += new System.EventHandler(this.rbFiat_CheckedChanged);
            // 
            // rbFerrari
            // 
            this.rbFerrari.AutoSize = true;
            this.rbFerrari.Location = new System.Drawing.Point(6, 42);
            this.rbFerrari.Name = "rbFerrari";
            this.rbFerrari.Size = new System.Drawing.Size(54, 17);
            this.rbFerrari.TabIndex = 1;
            this.rbFerrari.TabStop = true;
            this.rbFerrari.Text = "Ferrari";
            this.rbFerrari.UseVisualStyleBackColor = true;
            this.rbFerrari.CheckedChanged += new System.EventHandler(this.rbFerrari_CheckedChanged);
            // 
            // rbSeat
            // 
            this.rbSeat.AutoSize = true;
            this.rbSeat.Checked = true;
            this.rbSeat.Location = new System.Drawing.Point(6, 65);
            this.rbSeat.Name = "rbSeat";
            this.rbSeat.Size = new System.Drawing.Size(47, 17);
            this.rbSeat.TabIndex = 2;
            this.rbSeat.TabStop = true;
            this.rbSeat.Text = "Seat";
            this.rbSeat.UseVisualStyleBackColor = true;
            this.rbSeat.CheckedChanged += new System.EventHandler(this.rbSeat_CheckedChanged);
            // 
            // rbRojo
            // 
            this.rbRojo.AutoSize = true;
            this.rbRojo.Location = new System.Drawing.Point(6, 19);
            this.rbRojo.Name = "rbRojo";
            this.rbRojo.Size = new System.Drawing.Size(47, 17);
            this.rbRojo.TabIndex = 1;
            this.rbRojo.TabStop = true;
            this.rbRojo.Text = "Rojo";
            this.rbRojo.UseVisualStyleBackColor = true;
            this.rbRojo.CheckedChanged += new System.EventHandler(this.rbRojo_CheckedChanged);
            // 
            // rbNegro
            // 
            this.rbNegro.AutoSize = true;
            this.rbNegro.Location = new System.Drawing.Point(6, 42);
            this.rbNegro.Name = "rbNegro";
            this.rbNegro.Size = new System.Drawing.Size(54, 17);
            this.rbNegro.TabIndex = 2;
            this.rbNegro.TabStop = true;
            this.rbNegro.Text = "Negro";
            this.rbNegro.UseVisualStyleBackColor = true;
            this.rbNegro.CheckedChanged += new System.EventHandler(this.rbNegro_CheckedChanged);
            // 
            // rbBlanco
            // 
            this.rbBlanco.AutoSize = true;
            this.rbBlanco.Checked = true;
            this.rbBlanco.Location = new System.Drawing.Point(6, 65);
            this.rbBlanco.Name = "rbBlanco";
            this.rbBlanco.Size = new System.Drawing.Size(58, 17);
            this.rbBlanco.TabIndex = 3;
            this.rbBlanco.TabStop = true;
            this.rbBlanco.Text = "Blanco";
            this.rbBlanco.UseVisualStyleBackColor = true;
            this.rbBlanco.CheckedChanged += new System.EventHandler(this.rbBlanco_CheckedChanged);
            // 
            // pbCoches
            // 
            this.pbCoches.Image = global::WFEjercicios.Properties.Resources.seatBlanco;
            this.pbCoches.Location = new System.Drawing.Point(170, 202);
            this.pbCoches.Name = "pbCoches";
            this.pbCoches.Size = new System.Drawing.Size(417, 236);
            this.pbCoches.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pbCoches.TabIndex = 3;
            this.pbCoches.TabStop = false;
            this.pbCoches.Click += new System.EventHandler(this.pbCoches_Click);
            // 
            // Ejercicio3
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.gbColor);
            this.Controls.Add(this.gbMarca);
            this.Controls.Add(this.pbCoches);
            this.Name = "Ejercicio3";
            this.Text = "Ejercicio3";
            this.gbMarca.ResumeLayout(false);
            this.gbMarca.PerformLayout();
            this.gbColor.ResumeLayout(false);
            this.gbColor.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pbCoches)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.PictureBox pbCoches;
        private System.Windows.Forms.GroupBox gbMarca;
        private System.Windows.Forms.RadioButton rbSeat;
        private System.Windows.Forms.RadioButton rbFerrari;
        private System.Windows.Forms.RadioButton rbFiat;
        private System.Windows.Forms.GroupBox gbColor;
        private System.Windows.Forms.RadioButton rbBlanco;
        private System.Windows.Forms.RadioButton rbNegro;
        private System.Windows.Forms.RadioButton rbRojo;
    }
}