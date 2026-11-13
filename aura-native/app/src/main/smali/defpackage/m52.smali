.class public final synthetic Ldefpackage/m52;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:J

.field public final synthetic o:Ldefpackage/v52;

.field public final synthetic p:Landroid/content/Context;

.field public final synthetic q:Z


# direct methods
.method public synthetic constructor <init>(JLdefpackage/v52;Landroid/content/Context;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Ldefpackage/m52;->n:J

    .line 5
    .line 6
    iput-object p3, p0, Ldefpackage/m52;->o:Ldefpackage/v52;

    .line 7
    .line 8
    iput-object p4, p0, Ldefpackage/m52;->p:Landroid/content/Context;

    .line 9
    .line 10
    iput-boolean p5, p0, Ldefpackage/m52;->q:Z

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget-wide v0, p0, Ldefpackage/m52;->n:J

    .line 2
    .line 3
    iget-object v2, p0, Ldefpackage/m52;->o:Ldefpackage/v52;

    .line 4
    .line 5
    iget-object v4, p0, Ldefpackage/m52;->p:Landroid/content/Context;

    .line 6
    .line 7
    iget-boolean p0, p0, Ldefpackage/m52;->q:Z

    .line 8
    .line 9
    sget-wide v5, Ldefpackage/u52;->i:J

    .line 10
    .line 11
    cmp-long v3, v5, v0

    .line 12
    .line 13
    if-nez v3, :cond_1

    .line 14
    .line 15
    sget-object v3, Ldefpackage/u52;->b:Ldefpackage/k03;

    .line 16
    .line 17
    invoke-virtual {v3, v2}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object v3, Ldefpackage/z52;->a:Landroid/media/session/MediaSession;

    .line 21
    .line 22
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {v4, v2}, Ldefpackage/z52;->c(Landroid/content/Context;Ldefpackage/v52;)V

    .line 26
    .line 27
    .line 28
    sget-object v2, Ldefpackage/u52;->a:Landroid/os/Handler;

    .line 29
    .line 30
    invoke-static {}, Ldefpackage/u52;->m()V

    .line 31
    .line 32
    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    new-instance v5, Ldefpackage/cb4;

    .line 36
    .line 37
    new-instance p0, Landroid/content/ComponentName;

    .line 38
    .line 39
    const-class v2, Lcom/eddyizm/tempus/service/MediaService;

    .line 40
    .line 41
    invoke-direct {p0, v4, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 42
    .line 43
    .line 44
    invoke-direct {v5, v4, p0}, Ldefpackage/cb4;-><init>(Landroid/content/Context;Landroid/content/ComponentName;)V

    .line 45
    .line 46
    .line 47
    sget-object v6, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 48
    .line 49
    new-instance v7, Ldefpackage/aj2;

    .line 50
    .line 51
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-static {}, Ldefpackage/f35;->x()Landroid/os/Looper;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    new-instance v9, Ldefpackage/bl2;

    .line 59
    .line 60
    invoke-direct {v9, v8}, Ldefpackage/bl2;-><init>(Landroid/os/Looper;)V

    .line 61
    .line 62
    .line 63
    iget-object p0, v5, Ldefpackage/cb4;->a:Ldefpackage/bb4;

    .line 64
    .line 65
    invoke-interface {p0}, Ldefpackage/bb4;->e()Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-eqz p0, :cond_0

    .line 70
    .line 71
    new-instance p0, Ldefpackage/xc5;

    .line 72
    .line 73
    new-instance v2, Ldefpackage/x7;

    .line 74
    .line 75
    invoke-direct {v2, v4}, Ldefpackage/x7;-><init>(Landroid/content/Context;)V

    .line 76
    .line 77
    .line 78
    new-instance v3, Ldefpackage/fi0;

    .line 79
    .line 80
    invoke-direct {v3, v2}, Ldefpackage/fi0;-><init>(Ldefpackage/x7;)V

    .line 81
    .line 82
    .line 83
    const/4 v2, 0x4

    .line 84
    invoke-direct {p0, v2, v3}, Ldefpackage/xc5;-><init>(ILjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :goto_0
    move-object v10, p0

    .line 88
    goto :goto_1

    .line 89
    :cond_0
    const/4 p0, 0x0

    .line 90
    goto :goto_0

    .line 91
    :goto_1
    new-instance v3, Ldefpackage/bj2;

    .line 92
    .line 93
    invoke-direct/range {v3 .. v10}, Ldefpackage/sk2;-><init>(Landroid/content/Context;Ldefpackage/cb4;Landroid/os/Bundle;Ldefpackage/qk2;Landroid/os/Looper;Ldefpackage/bl2;Ldefpackage/xc5;)V

    .line 94
    .line 95
    .line 96
    new-instance p0, Landroid/os/Handler;

    .line 97
    .line 98
    invoke-direct {p0, v8}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 99
    .line 100
    .line 101
    new-instance v2, Ldefpackage/ws1;

    .line 102
    .line 103
    const/16 v4, 0xb

    .line 104
    .line 105
    invoke-direct {v2, v4, v9, v3}, Ldefpackage/ws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-static {p0, v2}, Ldefpackage/f35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 109
    .line 110
    .line 111
    new-instance p0, Ldefpackage/mm;

    .line 112
    .line 113
    const/4 v2, 0x3

    .line 114
    invoke-direct {p0, v0, v1, v9, v2}, Ldefpackage/mm;-><init>(JLjava/lang/Object;I)V

    .line 115
    .line 116
    .line 117
    new-instance v0, Ldefpackage/di;

    .line 118
    .line 119
    const/4 v1, 0x2

    .line 120
    invoke-direct {v0, v1}, Ldefpackage/di;-><init>(I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v9, p0, v0}, Ldefpackage/u0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 124
    .line 125
    .line 126
    :cond_1
    return-void
.end method
