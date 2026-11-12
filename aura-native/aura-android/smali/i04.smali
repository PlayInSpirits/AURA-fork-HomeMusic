.class public final synthetic Li04;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lj04;


# direct methods
.method public synthetic constructor <init>(Lj04;I)V
    .locals 0

    .line 1
    iput p2, p0, Li04;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Li04;->o:Lj04;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Li04;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Li04;->o:Lj04;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lj04;->c:Lhq1;

    .line 9
    .line 10
    iget-object v0, p0, Lhq1;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lj04;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget v0, p0, Lhq1;->a:I

    .line 17
    .line 18
    and-int/lit8 v0, v0, 0x3

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0}, Lhq1;->j()V

    .line 24
    .line 25
    .line 26
    :cond_1
    :goto_0
    return-void

    .line 27
    :pswitch_0
    iget-object p0, p0, Lj04;->c:Lhq1;

    .line 28
    .line 29
    iget-object v0, p0, Lhq1;->g:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lj04;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {p0}, Lhq1;->j()V

    .line 36
    .line 37
    .line 38
    :cond_2
    return-void

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
