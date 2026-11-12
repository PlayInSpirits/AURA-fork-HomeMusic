.class public final synthetic Ljm3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lmm3;

.field public final synthetic p:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lmm3;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Ljm3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ljm3;->o:Lmm3;

    .line 4
    .line 5
    iput-object p2, p0, Ljm3;->p:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Ljm3;->n:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Ljm3;->p:Ljava/lang/String;

    .line 5
    .line 6
    iget-object p0, p0, Ljm3;->o:Lmm3;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lmm3;->b:Lml3;

    .line 13
    .line 14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 15
    .line 16
    .line 17
    move-result-wide v4

    .line 18
    iget-object p0, p0, Lml3;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Ls24;

    .line 21
    .line 22
    new-instance v0, Ljl3;

    .line 23
    .line 24
    invoke-direct {v0, v3, v4, v5, v2}, Ljl3;-><init>(IJLjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0, v3, v1, v0}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_0
    iget-object p0, p0, Lmm3;->a:Lhg3;

    .line 32
    .line 33
    iget-object p0, p0, Lhg3;->o:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Ls24;

    .line 36
    .line 37
    new-instance v0, Lrs0;

    .line 38
    .line 39
    const/16 v4, 0xc

    .line 40
    .line 41
    invoke-direct {v0, v4, v2}, Lrs0;-><init>(ILjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p0, v3, v1, v0}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_1
    iget-object p0, p0, Lmm3;->a:Lhg3;

    .line 49
    .line 50
    iget-object p0, p0, Lhg3;->o:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, Ls24;

    .line 53
    .line 54
    new-instance v0, Lrs0;

    .line 55
    .line 56
    const/16 v4, 0xb

    .line 57
    .line 58
    invoke-direct {v0, v4, v2}, Lrs0;-><init>(ILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-static {p0, v3, v1, v0}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
