.class public final synthetic Ldefpackage/jm2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/lm2;
.implements Ldefpackage/it2;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:I

.field public final synthetic q:Ldefpackage/jn2;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;IILdefpackage/jn2;)V
    .locals 0

    .line 1
    const/4 p2, 0x2

    .line 2
    iput p2, p0, Ldefpackage/jm2;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ldefpackage/jm2;->o:Ljava/lang/String;

    .line 8
    .line 9
    iput p3, p0, Ldefpackage/jm2;->p:I

    .line 10
    .line 11
    iput-object p4, p0, Ldefpackage/jm2;->q:Ldefpackage/jn2;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILdefpackage/jn2;I)V
    .locals 0

    .line 14
    iput p4, p0, Ldefpackage/jm2;->n:I

    iput-object p1, p0, Ldefpackage/jm2;->o:Ljava/lang/String;

    iput p2, p0, Ldefpackage/jm2;->p:I

    iput-object p3, p0, Ldefpackage/jm2;->q:Ldefpackage/jn2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Ldefpackage/bm2;)V
    .locals 9

    .line 1
    iget v0, p0, Ldefpackage/jm2;->n:I

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v3, p1

    .line 9
    check-cast v3, Ldefpackage/kj2;

    .line 10
    .line 11
    invoke-virtual {v3}, Ldefpackage/bm2;->Y()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object p1, v3, Ldefpackage/kj2;->J:Ldefpackage/bj2;

    .line 19
    .line 20
    new-instance v2, Ldefpackage/er1;

    .line 21
    .line 22
    const/16 v7, 0x11

    .line 23
    .line 24
    iget-object v4, p0, Ldefpackage/jm2;->o:Ljava/lang/String;

    .line 25
    .line 26
    iget v5, p0, Ldefpackage/jm2;->p:I

    .line 27
    .line 28
    iget-object v6, p0, Ldefpackage/jm2;->q:Ldefpackage/jn2;

    .line 29
    .line 30
    invoke-direct/range {v2 .. v7}, Ldefpackage/er1;-><init>(Ldefpackage/kj2;Ljava/lang/String;ILdefpackage/jn2;I)V

    .line 31
    .line 32
    .line 33
    iget-object p0, p1, Ldefpackage/sk2;->e:Ldefpackage/qk2;

    .line 34
    .line 35
    check-cast p0, Ldefpackage/aj2;

    .line 36
    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    iget-object p1, p1, Ldefpackage/sk2;->f:Landroid/os/Handler;

    .line 40
    .line 41
    new-instance v0, Ldefpackage/ws1;

    .line 42
    .line 43
    invoke-direct {v0, v1, v2, p0}, Ldefpackage/ws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p1, v0}, Ldefpackage/f35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    :goto_0
    return-void

    .line 50
    :pswitch_0
    move-object v4, p1

    .line 51
    check-cast v4, Ldefpackage/kj2;

    .line 52
    .line 53
    invoke-virtual {v4}, Ldefpackage/bm2;->Y()Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-nez p1, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    iget-object p1, v4, Ldefpackage/kj2;->J:Ldefpackage/bj2;

    .line 61
    .line 62
    new-instance v3, Ldefpackage/er1;

    .line 63
    .line 64
    const/16 v8, 0x10

    .line 65
    .line 66
    iget-object v5, p0, Ldefpackage/jm2;->o:Ljava/lang/String;

    .line 67
    .line 68
    iget v6, p0, Ldefpackage/jm2;->p:I

    .line 69
    .line 70
    iget-object v7, p0, Ldefpackage/jm2;->q:Ldefpackage/jn2;

    .line 71
    .line 72
    invoke-direct/range {v3 .. v8}, Ldefpackage/er1;-><init>(Ldefpackage/kj2;Ljava/lang/String;ILdefpackage/jn2;I)V

    .line 73
    .line 74
    .line 75
    iget-object p0, p1, Ldefpackage/sk2;->e:Ldefpackage/qk2;

    .line 76
    .line 77
    check-cast p0, Ldefpackage/aj2;

    .line 78
    .line 79
    if-eqz p0, :cond_3

    .line 80
    .line 81
    iget-object p1, p1, Ldefpackage/sk2;->f:Landroid/os/Handler;

    .line 82
    .line 83
    new-instance v0, Ldefpackage/ws1;

    .line 84
    .line 85
    invoke-direct {v0, v1, v3, p0}, Ldefpackage/ws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-static {p1, v0}, Ldefpackage/f35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 89
    .line 90
    .line 91
    :cond_3
    :goto_1
    return-void

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public h(Ldefpackage/tn2;Ldefpackage/fr2;I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p3, p0, Ldefpackage/jm2;->q:Ldefpackage/jn2;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/jm2;->o:Ljava/lang/String;

    .line 4
    .line 5
    iget p0, p0, Ldefpackage/jm2;->p:I

    .line 6
    .line 7
    invoke-virtual {p1, p2, v0, p0, p3}, Ldefpackage/tn2;->r(Ldefpackage/fr2;Ljava/lang/String;ILdefpackage/jn2;)Ldefpackage/ic2;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
