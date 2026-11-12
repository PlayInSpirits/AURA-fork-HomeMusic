.class public final Lapp/homemusic/AURAHomeAnimation;
.super Ljava/lang/Object;

.method public static stop(Lkc1;)V
    .locals 2
    iget-object v0, p0, Lkc1;->T:Landroid/view/View;
    if-eqz v0, :clear_wave_view
    const v1, 0x7f0a0263
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
    move-result-object v0
    if-eqz v0, :clear_wave_view
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
    move-result-object v0
    instance-of v1, v0, Landroid/graphics/drawable/AnimationDrawable;
    if-eqz v1, :clear_wave_view
    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;
    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V
:clear_wave_view
    const/4 v0, 0x0
    sput-object v0, Lapp/homemusic/AURAVersion;->waveButton:Landroid/view/View;
    return-void
.end method
