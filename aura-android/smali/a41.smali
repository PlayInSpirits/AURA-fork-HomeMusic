.class public final synthetic La41;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lqc2;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lgn2;

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(Lgn2;II)V
    .locals 0

    .line 1
    iput p3, p0, La41;->n:I

    .line 2
    .line 3
    iput-object p1, p0, La41;->o:Lgn2;

    .line 4
    .line 5
    iput p2, p0, La41;->p:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, La41;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, La41;->p:I

    .line 7
    .line 8
    check-cast p1, Loi3;

    .line 9
    .line 10
    iget-object p0, p0, La41;->o:Lgn2;

    .line 11
    .line 12
    invoke-interface {p1, v0, p0}, Loi3;->t(ILgn2;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget v0, p0, La41;->p:I

    .line 17
    .line 18
    check-cast p1, Loi3;

    .line 19
    .line 20
    iget-object p0, p0, La41;->o:Lgn2;

    .line 21
    .line 22
    invoke-interface {p1, v0, p0}, Loi3;->t(ILgn2;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
