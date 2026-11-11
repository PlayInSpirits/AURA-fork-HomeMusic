.class public final Lapp/homemusic/AURAWaveToggleClickListener;
.super Ljava/lang/Object;
.implements Landroid/view/View$OnClickListener;

.field private final delegate:Landroid/view/View$OnClickListener;

.method public constructor <init>(Landroid/view/View$OnClickListener;)V
    .locals 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V
    iput-object p1, p0, Lapp/homemusic/AURAWaveToggleClickListener;->delegate:Landroid/view/View$OnClickListener;
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2
    sget-boolean v0, Lapp/homemusic/AURAVersion;->waveStarted:Z
    if-nez v0, :toggle_playback
    const/4 v0, 0x1
    sput-boolean v0, Lapp/homemusic/AURAVersion;->waveStarted:Z
    sput-boolean v0, Lapp/homemusic/AURAVersion;->wavePlaying:Z
    invoke-static {p1}, Lapp/homemusic/AURAWaveToggleClickListener;->syncIcon(Landroid/view/View;)V
    invoke-static {p1}, Lapp/homemusic/AURAWaveToggleClickListener;->pressAnimation(Landroid/view/View;)V
    iget-object v1, p0, Lapp/homemusic/AURAWaveToggleClickListener;->delegate:Landroid/view/View$OnClickListener;
    if-eqz v1, :done
    invoke-interface {v1, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V
    return-void

    :toggle_playback
    sget-boolean v0, Lapp/homemusic/AURAVersion;->wavePlaying:Z
    xor-int/lit8 v0, v0, 0x1
    sput-boolean v0, Lapp/homemusic/AURAVersion;->wavePlaying:Z
    invoke-static {p1}, Lapp/homemusic/AURAWaveToggleClickListener;->syncIcon(Landroid/view/View;)V
    invoke-static {p1}, Lapp/homemusic/AURAWaveToggleClickListener;->pressAnimation(Landroid/view/View;)V
    invoke-static {p1, v0}, Lapp/homemusic/AURAWaveToggleClickListener;->dispatchPlaybackKey(Landroid/view/View;Z)V
    :done
    return-void
.end method

.method public static syncIcon(Landroid/view/View;)V
    .locals 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;
    move-result-object v0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    move-result-object v1
    sget-boolean v2, Lapp/homemusic/AURAVersion;->wavePlaying:Z
    if-eqz v2, :play_icon
    const-string v2, "aura_wave_pause_icon"
    goto :resolve_icon
    :play_icon
    const-string v2, "aura_wave_play_icon"
    :resolve_icon
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    move-result-object v3
    const-string v4, "drawable"
    invoke-virtual {v3, v2, v4, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    move-result v4
    if-eqz v4, :sync_done
    move-object v2, p0
    check-cast v2, Landroid/view/ViewGroup;
    const/4 v3, 0x0
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
    move-result-object v2
    instance-of v3, v2, Landroid/widget/ImageView;
    if-eqz v3, :sync_done
    check-cast v2, Landroid/widget/ImageView;
    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setImageResource(I)V
    :sync_done
    return-void
.end method

.method private static pressAnimation(Landroid/view/View;)V
    .locals 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;
    move-result-object v0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    move-result-object v1
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    move-result-object v2
    const-string v3, "aura_wave_button_press"
    const-string v4, "anim"
    invoke-virtual {v2, v3, v4, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    move-result v4
    if-eqz v4, :animation_done
    invoke-static {v0, v4}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;
    move-result-object v4
    invoke-virtual {p0, v4}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
    :animation_done
    return-void
.end method

.method private static dispatchPlaybackKey(Landroid/view/View;Z)V
    .locals 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;
    move-result-object v0
    const-string v1, "audio"
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    move-result-object v0
    if-eqz v0, :dispatch_done
    check-cast v0, Landroid/media/AudioManager;
    const/16 v1, 0x7f
    if-eqz p1, :media_key_ready
    const/16 v1, 0x7e
    :media_key_ready
    new-instance v2, Landroid/view/KeyEvent;
    const/4 v3, 0x0
    invoke-direct {v2, v3, v1}, Landroid/view/KeyEvent;-><init>(II)V
    invoke-virtual {v0, v2}, Landroid/media/AudioManager;->dispatchMediaKeyEvent(Landroid/view/KeyEvent;)V
    new-instance v2, Landroid/view/KeyEvent;
    const/4 v3, 0x1
    invoke-direct {v2, v3, v1}, Landroid/view/KeyEvent;-><init>(II)V
    invoke-virtual {v0, v2}, Landroid/media/AudioManager;->dispatchMediaKeyEvent(Landroid/view/KeyEvent;)V
    :dispatch_done
    return-void
.end method
