.class public final synthetic Le62;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lh62;

.field public final synthetic p:J

.field public final synthetic q:Landroid/net/nsd/NsdServiceInfo;


# direct methods
.method public synthetic constructor <init>(Lh62;JLandroid/net/nsd/NsdServiceInfo;I)V
    .locals 0

    .line 1
    iput p5, p0, Le62;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Le62;->o:Lh62;

    .line 4
    .line 5
    iput-wide p2, p0, Le62;->p:J

    .line 6
    .line 7
    iput-object p4, p0, Le62;->q:Landroid/net/nsd/NsdServiceInfo;

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
    .locals 6

    .line 1
    iget v0, p0, Le62;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Le62;->q:Landroid/net/nsd/NsdServiceInfo;

    .line 5
    .line 6
    iget-wide v3, p0, Le62;->p:J

    .line 7
    .line 8
    iget-object p0, p0, Le62;->o:Lh62;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v3, v4}, Lh62;->l0(J)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lh62;->G0:Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    invoke-virtual {v2}, Landroid/net/nsd/NsdServiceInfo;->getServiceName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    new-instance v3, Lc62;

    .line 26
    .line 27
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    invoke-direct {v3, v2, v4, v5}, Lc62;-><init>(Landroid/net/nsd/NsdServiceInfo;J)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lh62;->n0()V

    .line 38
    .line 39
    .line 40
    iget-boolean v0, p0, Lh62;->O0:Z

    .line 41
    .line 42
    if-nez v0, :cond_0

    .line 43
    .line 44
    iget-boolean v0, p0, Lh62;->N0:Z

    .line 45
    .line 46
    if-nez v0, :cond_0

    .line 47
    .line 48
    const v0, 0x7f1302b8

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v0}, Lh62;->s0(I)V

    .line 52
    .line 53
    .line 54
    :cond_0
    return-void

    .line 55
    :pswitch_0
    invoke-virtual {p0, v3, v4}, Lh62;->l0(J)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget-object v1, p0, Lh62;->G0:Ljava/util/LinkedHashMap;

    .line 60
    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    invoke-virtual {v2}, Landroid/net/nsd/NsdServiceInfo;->getServiceName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v1, v0}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lh62;->n0()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_1

    .line 78
    .line 79
    iget-boolean v0, p0, Lh62;->O0:Z

    .line 80
    .line 81
    if-nez v0, :cond_1

    .line 82
    .line 83
    iget-boolean v0, p0, Lh62;->N0:Z

    .line 84
    .line 85
    if-nez v0, :cond_1

    .line 86
    .line 87
    const v0, 0x7f1302e3

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v0}, Lh62;->s0(I)V

    .line 91
    .line 92
    .line 93
    :cond_1
    return-void

    .line 94
    :pswitch_1
    invoke-virtual {p0, v3, v4}, Lh62;->l0(J)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_2

    .line 99
    .line 100
    iput-boolean v1, p0, Lh62;->N0:Z

    .line 101
    .line 102
    invoke-virtual {p0, v2}, Lh62;->k0(Landroid/net/nsd/NsdServiceInfo;)V

    .line 103
    .line 104
    .line 105
    :cond_2
    return-void

    .line 106
    :pswitch_2
    invoke-virtual {p0, v3, v4}, Lh62;->l0(J)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_3

    .line 111
    .line 112
    iput-boolean v1, p0, Lh62;->N0:Z

    .line 113
    .line 114
    iget-object v0, p0, Lh62;->G0:Ljava/util/LinkedHashMap;

    .line 115
    .line 116
    invoke-virtual {v2}, Landroid/net/nsd/NsdServiceInfo;->getServiceName()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v0, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0}, Lh62;->n0()V

    .line 124
    .line 125
    .line 126
    const v0, 0x7f1302b1

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, v0}, Lh62;->s0(I)V

    .line 130
    .line 131
    .line 132
    :cond_3
    return-void

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
