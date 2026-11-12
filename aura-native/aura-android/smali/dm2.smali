.class public final synthetic Ldm2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lim2;


# direct methods
.method public synthetic constructor <init>(Lim2;I)V
    .locals 0

    .line 10
    iput p2, p0, Ldm2;->n:I

    iput-object p1, p0, Ldm2;->o:Lim2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lim2;Lml3;)V
    .locals 0

    .line 1
    const/4 p2, 0x2

    .line 2
    iput p2, p0, Ldm2;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ldm2;->o:Lim2;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Ldm2;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ldm2;->o:Lim2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lim2;->a1()Lsk2;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lsk2;->f:Landroid/os/Handler;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-ne v0, v1, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    :goto_0
    invoke-static {v0}, Lrr2;->w(Z)V

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, Lsk2;->e:Lqk2;

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    new-instance v0, Lab4;

    .line 39
    .line 40
    const/4 v1, -0x6

    .line 41
    invoke-direct {v0, v1}, Lab4;-><init>(I)V

    .line 42
    .line 43
    .line 44
    new-instance v1, Lmw1;

    .line 45
    .line 46
    invoke-direct {v1, v0}, Lmw1;-><init>(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {p0}, Lqk2;->u()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_0
    new-instance v0, Ljj2;

    .line 54
    .line 55
    iget-object v1, p0, Lim2;->a:Landroid/content/Context;

    .line 56
    .line 57
    iget-object v2, p0, Lim2;->c:Lcb4;

    .line 58
    .line 59
    iget-object v2, v2, Lcb4;->a:Lbb4;

    .line 60
    .line 61
    invoke-interface {v2}, Lbb4;->b()Landroid/content/ComponentName;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    new-instance v3, Lz05;

    .line 66
    .line 67
    invoke-direct {v3, p0}, Lz05;-><init>(Lim2;)V

    .line 68
    .line 69
    .line 70
    iget-object v4, p0, Lim2;->b:Lsk2;

    .line 71
    .line 72
    iget-object v4, v4, Lsk2;->d:Lrk2;

    .line 73
    .line 74
    invoke-interface {v4}, Lrk2;->S0()Landroid/os/Bundle;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-direct {v0, v1, v2, v3, v4}, Ljj2;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Lz05;Landroid/os/Bundle;)V

    .line 79
    .line 80
    .line 81
    iput-object v0, p0, Lim2;->j:Ljj2;

    .line 82
    .line 83
    const-string p0, "MediaBrowserCompat"

    .line 84
    .line 85
    const-string v1, "Connecting to a MediaBrowserService."

    .line 86
    .line 87
    invoke-static {p0, v1}, Ll93;->A(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    iget-object p0, v0, Ljj2;->a:Lgj2;

    .line 91
    .line 92
    iget-object p0, p0, Lgj2;->b:Landroid/media/browse/MediaBrowser;

    .line 93
    .line 94
    invoke-virtual {p0}, Landroid/media/browse/MediaBrowser;->connect()V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :pswitch_1
    iget-boolean v0, p0, Lim2;->k:Z

    .line 99
    .line 100
    if-nez v0, :cond_2

    .line 101
    .line 102
    iget-object v0, p0, Lim2;->i:Lwo0;

    .line 103
    .line 104
    iget-object v0, v0, Lwo0;->n:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Lxk2;

    .line 107
    .line 108
    iget-object v0, v0, Lxk2;->e:Lpr2;

    .line 109
    .line 110
    invoke-virtual {v0}, Lpr2;->a()Lqu1;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    if-eqz v0, :cond_1

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_1
    invoke-virtual {p0}, Lim2;->e1()V

    .line 118
    .line 119
    .line 120
    :cond_2
    :goto_1
    return-void

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
