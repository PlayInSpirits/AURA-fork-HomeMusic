.class public final Lapp/homemusic/AURAWavePlaybackListener;
.super Ljava/lang/Object;
.implements Loi3;

.field private static trackedPlayer:Lqi3;
.field private static observer:Loi3;
.field private final player:Lqi3;

.method public constructor <init>(Lqi3;)V
    .locals 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V
    iput-object p1, p0, Lapp/homemusic/AURAWavePlaybackListener;->player:Lqi3;
    return-void
.end method

.method public static attach(Lqi3;)V
    .locals 3
    if-eqz p0, :attach_done
    sget-object v0, Lapp/homemusic/AURAWavePlaybackListener;->trackedPlayer:Lqi3;
    if-ne v0, p0, :replace_observer
    invoke-static {p0}, Lapp/homemusic/AURAWavePlaybackListener;->syncFromPlayer(Lqi3;)V
    return-void
:replace_observer
    if-eqz v0, :new_observer
    sget-object v1, Lapp/homemusic/AURAWavePlaybackListener;->observer:Loi3;
    if-eqz v1, :new_observer
    invoke-interface {v0, v1}, Lqi3;->r0(Loi3;)V
:new_observer
    new-instance v0, Lapp/homemusic/AURAWavePlaybackListener;
    invoke-direct {v0, p0}, Lapp/homemusic/AURAWavePlaybackListener;-><init>(Lqi3;)V
    sput-object v0, Lapp/homemusic/AURAWavePlaybackListener;->observer:Loi3;
    sput-object p0, Lapp/homemusic/AURAWavePlaybackListener;->trackedPlayer:Lqi3;
    invoke-interface {p0, v0}, Lqi3;->v(Loi3;)V
    invoke-static {p0}, Lapp/homemusic/AURAWavePlaybackListener;->syncFromPlayer(Lqi3;)V
:attach_done
    return-void
.end method

.method public static markBottomPlaybackInteraction()V
    .locals 1
    # The collapsed player header only exposes its Play/Pause toggle when a
    # media item exists. A real tap means the user chose the restored track.
    const/4 v0, 0x1
    sput-boolean v0, Lapp/homemusic/AURAVersion;->waveStarted:Z
    return-void
.end method

.method public static resetWaveState()V
    .locals 1
    const/4 v0, 0x0
    sput-boolean v0, Lapp/homemusic/AURAVersion;->waveStarted:Z
    sput-boolean v0, Lapp/homemusic/AURAVersion;->wavePending:Z
    sput-boolean v0, Lapp/homemusic/AURAVersion;->wavePlaying:Z
    sget-object v0, Lapp/homemusic/AURAVersion;->waveButton:Landroid/view/View;
    if-eqz v0, :reset_done
    invoke-static {v0}, Lapp/homemusic/AURAWaveToggleClickListener;->syncIcon(Landroid/view/View;)V
:reset_done
    return-void
.end method

.method public static syncCurrent()V
    .locals 1
    sget-object v0, Lis3;->c:Lcom/eddyizm/tempus/service/MediaService;
    if-eqz v0, :sync_current_done
    invoke-virtual {v0}, Lcom/eddyizm/tempus/service/MediaService;->b()Lqi3;
    move-result-object v0
    if-eqz v0, :sync_current_done
    invoke-static {v0}, Lapp/homemusic/AURAWavePlaybackListener;->syncFromPlayer(Lqi3;)V
:sync_current_done
    return-void
.end method

.method public static syncFromPlayer(Lqi3;)V
    .locals 3
    if-eqz p0, :sync_done
    invoke-interface {p0}, Lqi3;->a()Lgn2;
    move-result-object v0
    if-eqz v0, :no_current_item
    invoke-interface {p0}, Lqi3;->h0()Z
    move-result v1
    sput-boolean v1, Lapp/homemusic/AURAVersion;->wavePlaying:Z
    goto :update_icon

:no_current_item
    sget-boolean v1, Lapp/homemusic/AURAVersion;->wavePending:Z
    if-eqz v1, :player_empty
    const/4 v1, 0x1
    sput-boolean v1, Lapp/homemusic/AURAVersion;->wavePlaying:Z
    goto :update_icon

:player_empty
    const/4 v1, 0x0
    sput-boolean v1, Lapp/homemusic/AURAVersion;->wavePlaying:Z
    sput-boolean v1, Lapp/homemusic/AURAVersion;->waveStarted:Z

:update_icon
    sget-object v2, Lapp/homemusic/AURAVersion;->waveButton:Landroid/view/View;
    if-eqz v2, :sync_done
    invoke-static {v2}, Lapp/homemusic/AURAWaveToggleClickListener;->syncIcon(Landroid/view/View;)V
:sync_done
    return-void
.end method

.method public V(Z)V
    .locals 1
    iget-object v0, p0, Lapp/homemusic/AURAWavePlaybackListener;->player:Lqi3;
    invoke-static {v0}, Lapp/homemusic/AURAWavePlaybackListener;->syncFromPlayer(Lqi3;)V
    return-void
.end method

.method public q(Z)V
    .locals 1
    iget-object v0, p0, Lapp/homemusic/AURAWavePlaybackListener;->player:Lqi3;
    invoke-static {v0}, Lapp/homemusic/AURAWavePlaybackListener;->syncFromPlayer(Lqi3;)V
    return-void
.end method

.method public v(I)V
    .locals 1
    iget-object v0, p0, Lapp/homemusic/AURAWavePlaybackListener;->player:Lqi3;
    invoke-static {v0}, Lapp/homemusic/AURAWavePlaybackListener;->syncFromPlayer(Lqi3;)V
    return-void
.end method

.method public t(ILgn2;)V
    .locals 1
    iget-object v0, p0, Lapp/homemusic/AURAWavePlaybackListener;->player:Lqi3;
    invoke-static {v0}, Lapp/homemusic/AURAWavePlaybackListener;->syncFromPlayer(Lqi3;)V
    return-void
.end method
