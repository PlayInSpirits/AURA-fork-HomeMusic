.class public final synthetic Lm55;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lrf2;

.field public final synthetic p:J

.field public final synthetic q:I


# direct methods
.method public synthetic constructor <init>(Lrf2;IJ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lm55;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lm55;->o:Lrf2;

    .line 8
    .line 9
    iput p2, p0, Lm55;->q:I

    .line 10
    .line 11
    iput-wide p3, p0, Lm55;->p:J

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Lrf2;JI)V
    .locals 1

    .line 14
    const/4 v0, 0x1

    iput v0, p0, Lm55;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm55;->o:Lrf2;

    iput-wide p2, p0, Lm55;->p:J

    iput p4, p0, Lm55;->q:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lm55;->n:I

    .line 2
    .line 3
    iget v1, p0, Lm55;->q:I

    .line 4
    .line 5
    iget-wide v2, p0, Lm55;->p:J

    .line 6
    .line 7
    iget-object p0, p0, Lm55;->o:Lrf2;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lrf2;->o:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lo55;

    .line 15
    .line 16
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 17
    .line 18
    invoke-interface {p0, v1, v2, v3}, Lo55;->i(IJ)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget-object p0, p0, Lrf2;->o:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Lo55;

    .line 25
    .line 26
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 27
    .line 28
    invoke-interface {p0, v1, v2, v3}, Lo55;->m(IJ)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
