.class public final Lql;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcn;

.field public final c:Landroid/os/Handler;

.field public final d:Lol;

.field public final e:Lv9;

.field public final f:Lpl;

.field public g:Lnl;

.field public h:Landroid/media/AudioDeviceInfo;

.field public i:Lil;

.field public j:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcn;Lil;Landroid/media/AudioDeviceInfo;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lql;->a:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Lql;->b:Lcn;

    .line 11
    .line 12
    iput-object p3, p0, Lql;->i:Lil;

    .line 13
    .line 14
    iput-object p4, p0, Lql;->h:Landroid/media/AudioDeviceInfo;

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-static {p2}, Lf35;->q(Lgt0;)Landroid/os/Handler;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    iput-object p3, p0, Lql;->c:Landroid/os/Handler;

    .line 22
    .line 23
    new-instance p4, Lol;

    .line 24
    .line 25
    invoke-direct {p4, p0}, Lol;-><init>(Lql;)V

    .line 26
    .line 27
    .line 28
    iput-object p4, p0, Lql;->d:Lol;

    .line 29
    .line 30
    new-instance p4, Lv9;

    .line 31
    .line 32
    const/4 v0, 0x2

    .line 33
    invoke-direct {p4, v0, p0}, Lv9;-><init>(ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iput-object p4, p0, Lql;->e:Lv9;

    .line 37
    .line 38
    sget-object p4, Lnl;->c:Lnl;

    .line 39
    .line 40
    sget-object p4, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 41
    .line 42
    const-string v0, "Amazon"

    .line 43
    .line 44
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    const-string v0, "Xiaomi"

    .line 51
    .line 52
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p4

    .line 56
    if-eqz p4, :cond_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move-object p4, p2

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    :goto_0
    const-string p4, "external_surround_sound_enabled"

    .line 62
    .line 63
    invoke-static {p4}, Landroid/provider/Settings$Global;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    .line 64
    .line 65
    .line 66
    move-result-object p4

    .line 67
    :goto_1
    if-eqz p4, :cond_2

    .line 68
    .line 69
    new-instance p2, Lpl;

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-direct {p2, p0, p3, p1, p4}, Lpl;-><init>(Lql;Landroid/os/Handler;Landroid/content/ContentResolver;Landroid/net/Uri;)V

    .line 76
    .line 77
    .line 78
    :cond_2
    iput-object p2, p0, Lql;->f:Lpl;

    .line 79
    .line 80
    return-void
.end method


# virtual methods
.method public final a(Lnl;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lql;->j:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lql;->g:Lnl;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lnl;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iput-object p1, p0, Lql;->g:Lnl;

    .line 14
    .line 15
    iget-object p0, p0, Lql;->b:Lcn;

    .line 16
    .line 17
    iget-object p0, p0, Lcn;->o:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Ldn;

    .line 20
    .line 21
    invoke-virtual {p0}, Ldn;->f()V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Ldn;->g:Lnl;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lnl;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    iput-object p1, p0, Ldn;->g:Lnl;

    .line 35
    .line 36
    iget-object p0, p0, Ldn;->e:Ltc2;

    .line 37
    .line 38
    if-eqz p0, :cond_0

    .line 39
    .line 40
    new-instance p1, Lkf2;

    .line 41
    .line 42
    const/16 v0, 0x9

    .line 43
    .line 44
    invoke-direct {p1, v0}, Lkf2;-><init>(I)V

    .line 45
    .line 46
    .line 47
    const/4 v0, -0x1

    .line 48
    invoke-virtual {p0, v0, p1}, Ltc2;->f(ILqc2;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    return-void
.end method
