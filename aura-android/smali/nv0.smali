.class public final Lnv0;
.super Lep4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lxf1;


# instance fields
.field public final synthetic o:I


# direct methods
.method public synthetic constructor <init>(ILvd0;I)V
    .locals 0

    .line 1
    iput p3, p0, Lnv0;->o:I

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lep4;-><init>(ILvd0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget p0, p0, Lnv0;->o:I

    .line 2
    .line 3
    sget-object v0, Lj15;->a:Lj15;

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    check-cast p2, Lg83;

    .line 12
    .line 13
    iget-wide p0, p2, Lg83;->a:J

    .line 14
    .line 15
    check-cast p3, Lvd0;

    .line 16
    .line 17
    new-instance p0, Lnv0;

    .line 18
    .line 19
    const/4 p1, 0x2

    .line 20
    invoke-direct {p0, v1, p3, p1}, Lnv0;-><init>(ILvd0;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lnv0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {}, Lkf2;->k()V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    :goto_0
    return-object v0

    .line 32
    :pswitch_0
    check-cast p1, Lwe0;

    .line 33
    .line 34
    check-cast p2, Ljava/lang/Number;

    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 37
    .line 38
    .line 39
    check-cast p3, Lvd0;

    .line 40
    .line 41
    new-instance p0, Lnv0;

    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    invoke-direct {p0, v1, p3, p1}, Lnv0;-><init>(ILvd0;I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v0}, Lnv0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_1
    check-cast p1, Lwe0;

    .line 52
    .line 53
    check-cast p2, Lg83;

    .line 54
    .line 55
    iget-wide p0, p2, Lg83;->a:J

    .line 56
    .line 57
    check-cast p3, Lvd0;

    .line 58
    .line 59
    new-instance p0, Lnv0;

    .line 60
    .line 61
    const/4 p1, 0x0

    .line 62
    invoke-direct {p0, v1, p3, p1}, Lnv0;-><init>(ILvd0;I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v0}, Lnv0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    return-object v0

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget p0, p0, Lnv0;->o:I

    .line 2
    .line 3
    sget-object v0, Lj15;->a:Lj15;

    .line 4
    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_1
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
