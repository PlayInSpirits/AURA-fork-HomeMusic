.class public final synthetic Lw52;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lx52;

.field public final synthetic p:Landroid/media/session/MediaSession;

.field public final synthetic q:I


# direct methods
.method public synthetic constructor <init>(Lx52;Landroid/media/session/MediaSession;II)V
    .locals 0

    .line 1
    iput p4, p0, Lw52;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lw52;->o:Lx52;

    .line 4
    .line 5
    iput-object p2, p0, Lw52;->p:Landroid/media/session/MediaSession;

    .line 6
    .line 7
    iput p3, p0, Lw52;->q:I

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lw52;->n:I

    .line 2
    .line 3
    const-string v1, "device_volume"

    .line 4
    .line 5
    const-string v2, "command"

    .line 6
    .line 7
    iget v3, p0, Lw52;->q:I

    .line 8
    .line 9
    iget-object v4, p0, Lw52;->p:Landroid/media/session/MediaSession;

    .line 10
    .line 11
    iget-object p0, p0, Lw52;->o:Lx52;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v0, Lz52;->b:Lx52;

    .line 17
    .line 18
    if-ne v0, p0, :cond_1

    .line 19
    .line 20
    sget-object p0, Lz52;->a:Landroid/media/session/MediaSession;

    .line 21
    .line 22
    if-ne p0, v4, :cond_1

    .line 23
    .line 24
    sget-object p0, Lu52;->a:Landroid/os/Handler;

    .line 25
    .line 26
    invoke-static {}, Lu52;->c()Lv52;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    iget-boolean p0, p0, Lv52;->b:Z

    .line 31
    .line 32
    if-nez p0, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    new-instance p0, Lorg/json/JSONObject;

    .line 36
    .line 37
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {}, Lu52;->c()Lv52;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget v0, v0, Lv52;->n:I

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    invoke-static {v3, v1, v0}, Lgb;->m(III)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    const-string v1, "level"

    .line 56
    .line 57
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    new-instance v0, Lk52;

    .line 65
    .line 66
    const/4 v1, 0x3

    .line 67
    invoke-direct {v0, v1}, Lk52;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-static {p0, v0}, Lu52;->p(Lorg/json/JSONObject;Lif1;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    :goto_0
    return-void

    .line 74
    :pswitch_0
    sget-object v0, Lz52;->b:Lx52;

    .line 75
    .line 76
    if-ne v0, p0, :cond_3

    .line 77
    .line 78
    sget-object p0, Lz52;->a:Landroid/media/session/MediaSession;

    .line 79
    .line 80
    if-ne p0, v4, :cond_3

    .line 81
    .line 82
    sget-object p0, Lu52;->a:Landroid/os/Handler;

    .line 83
    .line 84
    invoke-static {}, Lu52;->c()Lv52;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    iget-boolean p0, p0, Lv52;->b:Z

    .line 89
    .line 90
    if-eqz p0, :cond_3

    .line 91
    .line 92
    const/4 p0, 0x1

    .line 93
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    const/4 v0, -0x1

    .line 98
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    filled-new-array {p0, v0}, [Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-static {p0}, Lgb;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    if-nez p0, :cond_2

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_2
    new-instance p0, Lorg/json/JSONObject;

    .line 122
    .line 123
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    const-string v0, "direction"

    .line 131
    .line 132
    invoke-virtual {p0, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    new-instance v0, Lk52;

    .line 140
    .line 141
    const/4 v1, 0x4

    .line 142
    invoke-direct {v0, v1}, Lk52;-><init>(I)V

    .line 143
    .line 144
    .line 145
    invoke-static {p0, v0}, Lu52;->p(Lorg/json/JSONObject;Lif1;)V

    .line 146
    .line 147
    .line 148
    :cond_3
    :goto_1
    return-void

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
