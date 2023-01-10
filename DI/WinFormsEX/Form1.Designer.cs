namespace WinFormsEX
{
    partial class Form1
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.btFParte1 = new System.Windows.Forms.Button();
            this.btFParte2 = new System.Windows.Forms.Button();
            this.btFParte3 = new System.Windows.Forms.Button();
            this.btFParte4 = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // btFParte1
            // 
            this.btFParte1.Location = new System.Drawing.Point(246, 78);
            this.btFParte1.Name = "btFParte1";
            this.btFParte1.Size = new System.Drawing.Size(205, 65);
            this.btFParte1.TabIndex = 0;
            this.btFParte1.Text = "Ejercicio 1 ";
            this.btFParte1.UseVisualStyleBackColor = true;
            this.btFParte1.Click += new System.EventHandler(this.btFParte1_Click);
            // 
            // btFParte2
            // 
            this.btFParte2.Location = new System.Drawing.Point(246, 153);
            this.btFParte2.Name = "btFParte2";
            this.btFParte2.Size = new System.Drawing.Size(205, 63);
            this.btFParte2.TabIndex = 1;
            this.btFParte2.TabStop = false;
            this.btFParte2.Text = "Ejercicio 2";
            this.btFParte2.UseVisualStyleBackColor = true;
            this.btFParte2.Click += new System.EventHandler(this.btFParte2_Click);
            // 
            // btFParte3
            // 
            this.btFParte3.Location = new System.Drawing.Point(246, 222);
            this.btFParte3.Name = "btFParte3";
            this.btFParte3.Size = new System.Drawing.Size(205, 66);
            this.btFParte3.TabIndex = 2;
            this.btFParte3.Text = "Ejercicio 3";
            this.btFParte3.UseVisualStyleBackColor = true;
            this.btFParte3.Click += new System.EventHandler(this.btFParte3_Click);
            // 
            // btFParte4
            // 
            this.btFParte4.Location = new System.Drawing.Point(246, 294);
            this.btFParte4.Name = "btFParte4";
            this.btFParte4.Size = new System.Drawing.Size(205, 65);
            this.btFParte4.TabIndex = 3;
            this.btFParte4.Text = "Ejercicio 4";
            this.btFParte4.UseVisualStyleBackColor = true;
            this.btFParte4.Click += new System.EventHandler(this.btFParte4_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.btFParte4);
            this.Controls.Add(this.btFParte3);
            this.Controls.Add(this.btFParte2);
            this.Controls.Add(this.btFParte1);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button btFParte1;
        private System.Windows.Forms.Button btFParte2;
        private System.Windows.Forms.Button btFParte3;
        private System.Windows.Forms.Button btFParte4;
    }
}

