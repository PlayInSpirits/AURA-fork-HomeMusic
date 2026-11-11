.class public final synthetic Lcs2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lks2;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lls2;

.field public final synthetic p:J


# direct methods
.method public synthetic constructor <init>(Lls2;JI)V
    .locals 0

    .line 1
    iput p4, p0, Lcs2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lcs2;->o:Lls2;

    .line 4
    .line 5
    iput-wide p2, p0, Lcs2;->p:J

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b(Lfr2;)V
    .locals 2

    .line 1
    iget p1, p0, Lcs2;->n:I

    .line 2
    .line 3
    iget-wide v0, p0, Lcs2;->p:J

    .line 4
    .line 5
    iget-object p0, p0, Lcs2;->o:Lls2;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lls2;->g:Ltn2;

    .line 11
    .line 12
    iget-object p0, p0, Ltn2;->s:Lal3;

    .line 13
    .line 14
    invoke-virtual {p0, v0, v1}, Lal3;->O(J)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object p0, p0, Lls2;->g:Ltn2;

    .line 19
    .line 20
    iget-object p0, p0, Ltn2;->s:Lal3;

    .line 21
    .line 22
    long-to-int p1, v0

    .line 23
    invoke-virtual {p0, p1}, Lal3;->W(I)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
