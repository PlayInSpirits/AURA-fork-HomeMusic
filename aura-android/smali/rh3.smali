.class public final synthetic Lrh3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lp42;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lai3;


# direct methods
.method public synthetic constructor <init>(Lai3;I)V
    .locals 0

    .line 1
    iput p2, p0, Lrh3;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lrh3;->b:Lai3;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(F)Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lrh3;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lrh3;->b:Lai3;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lai3;->n0(F)F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-static {p1}, Lai3;->p0(F)F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/high16 v0, 0x42c80000    # 100.0f

    .line 17
    .line 18
    mul-float/2addr p1, v0

    .line 19
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const v0, 0x7f1303cf

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0, p1}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :pswitch_0
    invoke-static {p1}, Lai3;->n0(F)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-static {p1}, Lai3;->q0(F)F

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const v0, 0x7f1303d6

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0, p1}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
