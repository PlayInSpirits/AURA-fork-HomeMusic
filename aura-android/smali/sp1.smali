.class public final Lsp1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lac4;


# static fields
.field public static final b:Lsp1;


# instance fields
.field public final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lsp1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lsp1;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lsp1;->b:Lsp1;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lsp1;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(JLr62;Loo0;)Lya4;
    .locals 4

    .line 1
    iget p0, p0, Lsp1;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Lnb3;

    .line 7
    .line 8
    const-wide/16 p3, 0x0

    .line 9
    .line 10
    invoke-static {p3, p4, p1, p2}, Lbu;->d(JJ)Lwv3;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-direct {p0, p1}, Lnb3;-><init>(Lwv3;)V

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    const/high16 p0, 0x41f00000    # 30.0f

    .line 19
    .line 20
    invoke-interface {p4, p0}, Loo0;->V(F)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    int-to-float p0, p0

    .line 25
    new-instance p3, Lnb3;

    .line 26
    .line 27
    new-instance p4, Lwv3;

    .line 28
    .line 29
    neg-float v0, p0

    .line 30
    const/16 v1, 0x20

    .line 31
    .line 32
    shr-long v1, p1, v1

    .line 33
    .line 34
    long-to-int v1, v1

    .line 35
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    const-wide v2, 0xffffffffL

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    and-long/2addr p1, v2

    .line 45
    long-to-int p1, p1

    .line 46
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    add-float/2addr p1, p0

    .line 51
    const/4 p0, 0x0

    .line 52
    invoke-direct {p4, p0, v0, v1, p1}, Lwv3;-><init>(FFFF)V

    .line 53
    .line 54
    .line 55
    invoke-direct {p3, p4}, Lnb3;-><init>(Lwv3;)V

    .line 56
    .line 57
    .line 58
    return-object p3

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lsp1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    const-string p0, "RectangleShape"

    .line 12
    .line 13
    return-object p0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
