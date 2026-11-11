.class public final Lol;
.super Landroid/media/AudioDeviceCallback;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:Lql;


# direct methods
.method public constructor <init>(Lql;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lol;->a:Lql;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/media/AudioDeviceCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onAudioDevicesAdded([Landroid/media/AudioDeviceInfo;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lol;->a:Lql;

    .line 2
    .line 3
    iget-object p1, p0, Lql;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v0, p0, Lql;->i:Lil;

    .line 6
    .line 7
    iget-object v1, p0, Lql;->h:Landroid/media/AudioDeviceInfo;

    .line 8
    .line 9
    invoke-static {p1, v0, v1}, Lnl;->b(Landroid/content/Context;Lil;Landroid/media/AudioDeviceInfo;)Lnl;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Lql;->a(Lnl;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onAudioDevicesRemoved([Landroid/media/AudioDeviceInfo;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lol;->a:Lql;

    .line 2
    .line 3
    iget-object v0, p0, Lql;->h:Landroid/media/AudioDeviceInfo;

    .line 4
    .line 5
    invoke-static {p1, v0}, Lf35;->m([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput-object p1, p0, Lql;->h:Landroid/media/AudioDeviceInfo;

    .line 13
    .line 14
    :cond_0
    iget-object p1, p0, Lql;->a:Landroid/content/Context;

    .line 15
    .line 16
    iget-object v0, p0, Lql;->i:Lil;

    .line 17
    .line 18
    iget-object v1, p0, Lql;->h:Landroid/media/AudioDeviceInfo;

    .line 19
    .line 20
    invoke-static {p1, v0, v1}, Lnl;->b(Landroid/content/Context;Lil;Landroid/media/AudioDeviceInfo;)Lnl;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p0, p1}, Lql;->a(Lnl;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
