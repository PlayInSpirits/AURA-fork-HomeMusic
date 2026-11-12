.class public Lgj2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/media/browse/MediaBrowser;

.field public final c:Landroid/os/Bundle;

.field public final d:Lcj2;

.field public final e:Loi;

.field public f:Lxc5;

.field public g:Landroid/os/Messenger;

.field public h:Lpr2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/ComponentName;Lz05;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcj2;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcj2;-><init>(Lgj2;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lgj2;->d:Lcj2;

    .line 10
    .line 11
    new-instance v0, Loi;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, v1}, Lyd4;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lgj2;->e:Loi;

    .line 18
    .line 19
    iput-object p1, p0, Lgj2;->a:Landroid/content/Context;

    .line 20
    .line 21
    new-instance v0, Landroid/os/Bundle;

    .line 22
    .line 23
    if-eqz p4, :cond_0

    .line 24
    .line 25
    invoke-direct {v0, p4}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 30
    .line 31
    .line 32
    :goto_0
    iput-object v0, p0, Lgj2;->c:Landroid/os/Bundle;

    .line 33
    .line 34
    const-string p4, "extra_client_version"

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    invoke-virtual {v0, p4, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    const-string p4, "extra_calling_pid"

    .line 41
    .line 42
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    invoke-virtual {v0, p4, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    iput-object p0, p3, Lz05;->p:Ljava/lang/Object;

    .line 50
    .line 51
    new-instance p4, Landroid/media/browse/MediaBrowser;

    .line 52
    .line 53
    iget-object p3, p3, Lz05;->o:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p3, Ldj2;

    .line 56
    .line 57
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-direct {p4, p1, p2, p3, v0}, Landroid/media/browse/MediaBrowser;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Landroid/media/browse/MediaBrowser$ConnectionCallback;Landroid/os/Bundle;)V

    .line 61
    .line 62
    .line 63
    iput-object p4, p0, Lgj2;->b:Landroid/media/browse/MediaBrowser;

    .line 64
    .line 65
    return-void
.end method
