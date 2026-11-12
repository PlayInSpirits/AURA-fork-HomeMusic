.class public final Lg22;
.super Lm91;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic o:I

.field public final synthetic p:Ljava/lang/Iterable;

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Iterable;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lg22;->o:I

    .line 2
    .line 3
    iput-object p1, p0, Lg22;->p:Ljava/lang/Iterable;

    .line 4
    .line 5
    iput-object p2, p0, Lg22;->q:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Lm91;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    iget v0, p0, Lg22;->o:I

    .line 2
    .line 3
    iget-object v1, p0, Lg22;->q:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lg22;->p:Ljava/lang/Iterable;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast v1, Lss2;

    .line 15
    .line 16
    new-instance v0, Li22;

    .line 17
    .line 18
    invoke-direct {v0, p0, v1}, Li22;-><init>(Ljava/util/Iterator;Leg1;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast v1, Lro3;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v0, Lh22;

    .line 32
    .line 33
    invoke-direct {v0, p0, v1}, Lh22;-><init>(Ljava/util/Iterator;Lro3;)V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
