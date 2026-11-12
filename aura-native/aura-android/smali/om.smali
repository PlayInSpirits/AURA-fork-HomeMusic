.class public final synthetic Lom;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:J

.field public final synthetic q:J

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/String;JJI)V
    .locals 0

    .line 1
    iput p7, p0, Lom;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lom;->r:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lom;->o:Ljava/lang/String;

    .line 6
    .line 7
    iput-wide p3, p0, Lom;->p:J

    .line 8
    .line 9
    iput-wide p5, p0, Lom;->q:J

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Lom;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Lom;->r:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, Lrf2;

    .line 9
    .line 10
    iget-object v0, v1, Lrf2;->o:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v1, v0

    .line 13
    check-cast v1, Lo55;

    .line 14
    .line 15
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 16
    .line 17
    iget-wide v2, p0, Lom;->p:J

    .line 18
    .line 19
    iget-wide v4, p0, Lom;->q:J

    .line 20
    .line 21
    iget-object v6, p0, Lom;->o:Ljava/lang/String;

    .line 22
    .line 23
    invoke-interface/range {v1 .. v6}, Lo55;->x(JJLjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_0
    check-cast v1, Lxc5;

    .line 28
    .line 29
    iget-object v0, v1, Lxc5;->p:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v1, v0

    .line 32
    check-cast v1, Lqm;

    .line 33
    .line 34
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 35
    .line 36
    iget-wide v2, p0, Lom;->p:J

    .line 37
    .line 38
    iget-wide v4, p0, Lom;->q:J

    .line 39
    .line 40
    iget-object v6, p0, Lom;->o:Ljava/lang/String;

    .line 41
    .line 42
    invoke-interface/range {v1 .. v6}, Lqm;->V(JJLjava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
