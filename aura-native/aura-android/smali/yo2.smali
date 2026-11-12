.class public final Lyo2;
.super Landroid/media/MediaRouter2$TransferCallback;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:Lzo2;


# direct methods
.method public constructor <init>(Lzo2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyo2;->a:Lzo2;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/media/MediaRouter2$TransferCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onStop(Landroid/media/MediaRouter2$RoutingController;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object p0, p0, Lyo2;->a:Lzo2;

    .line 3
    .line 4
    iput-object v0, p0, Lzo2;->E:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v0, p0, Lzo2;->x:Landroid/util/ArrayMap;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/util/ArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Loq2;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    iget-object p0, p0, Lzo2;->w:Lhg3;

    .line 17
    .line 18
    iget-object p0, p0, Lhg3;->o:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lui1;

    .line 21
    .line 22
    iget-object p1, p0, Lui1;->d:Loq2;

    .line 23
    .line 24
    if-ne v0, p1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Lui1;->c()Lwq2;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p0}, Lui1;->g()Lwq2;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eq v0, p1, :cond_0

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    const/4 v1, 0x2

    .line 38
    invoke-virtual {p0, p1, v1, v0}, Lui1;->j(Lwq2;IZ)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void

    .line 42
    :cond_1
    sget p0, Lui1;->B:I

    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v0, "onStop: No matching routeController found. routingController="

    .line 48
    .line 49
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    const-string p1, "MR2Provider"

    .line 60
    .line 61
    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final onTransfer(Landroid/media/MediaRouter2$RoutingController;Landroid/media/MediaRouter2$RoutingController;)V
    .locals 10

    .line 1
    iget-object p0, p0, Lyo2;->a:Lzo2;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lzo2;->E:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v1, p0, Lzo2;->x:Landroid/util/ArrayMap;

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Landroid/util/ArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lzo2;->v:Landroid/media/MediaRouter2;

    .line 12
    .line 13
    invoke-static {p1}, Lto2;->c(Landroid/media/MediaRouter2;)Landroid/media/MediaRouter2$RoutingController;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 v1, 0x1

    .line 18
    const/4 v2, 0x3

    .line 19
    if-ne p2, p1, :cond_1

    .line 20
    .line 21
    iget-object p0, p0, Lzo2;->w:Lhg3;

    .line 22
    .line 23
    iget-object p0, p0, Lhg3;->o:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Lui1;

    .line 26
    .line 27
    invoke-virtual {p0}, Lui1;->c()Lwq2;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0}, Lui1;->g()Lwq2;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    if-eq p2, p1, :cond_0

    .line 36
    .line 37
    invoke-virtual {p0, p1, v2, v1}, Lui1;->j(Lwq2;IZ)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void

    .line 41
    :cond_1
    invoke-static {p2}, Lto2;->l(Landroid/media/MediaRouter2$RoutingController;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_2

    .line 50
    .line 51
    const-string p0, "MR2Provider"

    .line 52
    .line 53
    const-string p1, "Selected routes are empty. This shouldn\'t happen."

    .line 54
    .line 55
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    const/4 v3, 0x0

    .line 60
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {p1}, Ll3;->g(Ljava/lang/Object;)Landroid/media/MediaRoute2Info;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-static {p1}, Lto2;->i(Landroid/media/MediaRoute2Info;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    new-instance v4, Lvo2;

    .line 73
    .line 74
    invoke-direct {v4, p0, p2, p1}, Lvo2;-><init>(Lzo2;Landroid/media/MediaRouter2$RoutingController;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iget-object v5, p0, Lzo2;->x:Landroid/util/ArrayMap;

    .line 78
    .line 79
    invoke-virtual {v5, p2, v4}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    iget-object v4, p0, Lzo2;->w:Lhg3;

    .line 83
    .line 84
    iget-object v4, v4, Lhg3;->o:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v4, Lui1;

    .line 87
    .line 88
    iget-object v5, v4, Lui1;->h:Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    :cond_3
    :goto_0
    if-ge v3, v6, :cond_5

    .line 95
    .line 96
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    add-int/lit8 v3, v3, 0x1

    .line 101
    .line 102
    check-cast v7, Lwq2;

    .line 103
    .line 104
    invoke-virtual {v7}, Lwq2;->c()Lqq2;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    iget-object v9, v4, Lui1;->q:Lzo2;

    .line 109
    .line 110
    if-eq v8, v9, :cond_4

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_4
    iget-object v8, v7, Lwq2;->b:Ljava/lang/String;

    .line 114
    .line 115
    invoke-static {p1, v8}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    if-eqz v8, :cond_3

    .line 120
    .line 121
    move-object v0, v7

    .line 122
    :cond_5
    if-nez v0, :cond_6

    .line 123
    .line 124
    new-instance v0, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    const-string v1, "onSelectRoute: The target RouteInfo is not found for descriptorId="

    .line 127
    .line 128
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    const-string v0, "AxMediaRouter"

    .line 139
    .line 140
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_6
    invoke-virtual {v4, v0, v2, v1}, Lui1;->j(Lwq2;IZ)V

    .line 145
    .line 146
    .line 147
    :goto_1
    invoke-virtual {p0, p2}, Lzo2;->j(Landroid/media/MediaRouter2$RoutingController;)V

    .line 148
    .line 149
    .line 150
    return-void
.end method

.method public final onTransferFailure(Landroid/media/MediaRoute2Info;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lyo2;->a:Lzo2;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lzo2;->E:Ljava/lang/String;

    .line 5
    .line 6
    new-instance p0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v0, "Transfer failed. requestedRoute="

    .line 9
    .line 10
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const-string p1, "MR2Provider"

    .line 21
    .line 22
    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    return-void
.end method
