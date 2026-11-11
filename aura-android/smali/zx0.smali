.class public final synthetic Lzx0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ld64;


# direct methods
.method public synthetic constructor <init>(Ld64;I)V
    .locals 0

    .line 1
    iput p2, p0, Lzx0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lzx0;->b:Ld64;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lzx0;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lzx0;->b:Ld64;

    .line 4
    .line 5
    check-cast p1, Lgy0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p1, p1, Lgy0;->g:Ljava/util/function/Function;

    .line 11
    .line 12
    invoke-interface {p1, p0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ljava/lang/Double;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_0
    iget-object p1, p1, Lgy0;->f:Ljava/util/function/Function;

    .line 20
    .line 21
    invoke-interface {p1, p0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Ljava/lang/Double;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_1
    invoke-virtual {p1, p0}, Lgy0;->d(Ld64;)D

    .line 29
    .line 30
    .line 31
    move-result-wide p0

    .line 32
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
