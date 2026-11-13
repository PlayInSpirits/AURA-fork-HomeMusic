.class public final Ldefpackage/fv3;
.super Ldefpackage/n14;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic n:I

.field public final o:J

.field public final p:Ljava/lang/Object;

.field public final q:Ldefpackage/fw;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;JLdefpackage/fw;I)V
    .locals 0

    .line 1
    iput p5, p0, Ldefpackage/fv3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/fv3;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iput-wide p2, p0, Ldefpackage/fv3;->o:J

    .line 6
    .line 7
    iput-object p4, p0, Ldefpackage/fv3;->q:Ldefpackage/fw;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final contentLength()J
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/fv3;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, Ldefpackage/fv3;->o:J

    .line 7
    .line 8
    return-wide v0

    .line 9
    :pswitch_0
    iget-wide v0, p0, Ldefpackage/fv3;->o:J

    .line 10
    .line 11
    return-wide v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final contentType()Ldefpackage/hu2;
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/fv3;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/fv3;->p:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Ldefpackage/hu2;

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    check-cast p0, Ljava/lang/String;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    :try_start_0
    invoke-static {p0}, Ldefpackage/ve5;->a(Ljava/lang/String;)Ldefpackage/hu2;

    .line 17
    .line 18
    .line 19
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    :catch_0
    :cond_0
    return-object v0

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final source()Ldefpackage/fw;
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/fv3;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/fv3;->q:Ldefpackage/fw;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    check-cast p0, Ldefpackage/xu3;

    .line 10
    .line 11
    return-object p0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
