.class public final Lfc0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lq81;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lfc0;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Lfc0;->o:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lvd0;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lfc0;->n:I

    .line 2
    .line 3
    sget-object v1, Lj15;->a:Lj15;

    .line 4
    .line 5
    iget-object v2, p0, Lfc0;->o:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Number;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    check-cast v2, Lrx2;

    .line 17
    .line 18
    iget-object p1, v2, Lrx2;->p:Lvd3;

    .line 19
    .line 20
    invoke-virtual {p1, p0}, Lvd3;->h(F)V

    .line 21
    .line 22
    .line 23
    return-object v1

    .line 24
    :pswitch_0
    check-cast v2, Ljx3;

    .line 25
    .line 26
    iput-object p1, v2, Ljx3;->n:Ljava/lang/Object;

    .line 27
    .line 28
    new-instance p1, Lkotlinx/coroutines/flow/internal/AbortFlowException;

    .line 29
    .line 30
    invoke-direct {p1, p0}, Lkotlinx/coroutines/flow/internal/AbortFlowException;-><init>(Lq81;)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :pswitch_1
    instance-of v0, p2, Lec0;

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    move-object v0, p2

    .line 39
    check-cast v0, Lec0;

    .line 40
    .line 41
    iget v3, v0, Lec0;->o:I

    .line 42
    .line 43
    const/high16 v4, -0x80000000

    .line 44
    .line 45
    and-int v5, v3, v4

    .line 46
    .line 47
    if-eqz v5, :cond_0

    .line 48
    .line 49
    sub-int/2addr v3, v4

    .line 50
    iput v3, v0, Lec0;->o:I

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    new-instance v0, Lec0;

    .line 54
    .line 55
    invoke-direct {v0, p0, p2}, Lec0;-><init>(Lfc0;Lvd0;)V

    .line 56
    .line 57
    .line 58
    :goto_0
    iget-object p0, v0, Lec0;->n:Ljava/lang/Object;

    .line 59
    .line 60
    iget p2, v0, Lec0;->o:I

    .line 61
    .line 62
    const/4 v3, 0x1

    .line 63
    if-eqz p2, :cond_2

    .line 64
    .line 65
    if-ne p2, v3, :cond_1

    .line 66
    .line 67
    invoke-static {p0}, Lkb4;->X(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 72
    .line 73
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const/4 v1, 0x0

    .line 77
    goto :goto_1

    .line 78
    :cond_2
    invoke-static {p0}, Lkb4;->X(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    check-cast v2, Lq81;

    .line 82
    .line 83
    instance-of p0, p1, Lsc0;

    .line 84
    .line 85
    if-eqz p0, :cond_3

    .line 86
    .line 87
    iput v3, v0, Lec0;->o:I

    .line 88
    .line 89
    invoke-interface {v2, p1, v0}, Lq81;->b(Ljava/lang/Object;Lvd0;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    sget-object p1, Lxe0;->n:Lxe0;

    .line 94
    .line 95
    if-ne p0, p1, :cond_3

    .line 96
    .line 97
    move-object v1, p1

    .line 98
    :cond_3
    :goto_1
    return-object v1

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
