.class public final Lsv2;
.super Lbc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic f:I

.field public final g:J


# direct methods
.method public constructor <init>(IJLcu4;)V
    .locals 0

    .line 1
    iput p1, p0, Lsv2;->f:I

    .line 2
    .line 3
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p4}, Lbc1;-><init>(Lcu4;)V

    .line 10
    .line 11
    .line 12
    iput-wide p2, p0, Lsv2;->g:J

    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    invoke-direct {p0, p4}, Lbc1;-><init>(Lcu4;)V

    .line 16
    .line 17
    .line 18
    iput-wide p2, p0, Lsv2;->g:J

    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public f(ILzt4;Z)Lzt4;
    .locals 1

    .line 1
    iget v0, p0, Lsv2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Lbc1;->f(ILzt4;Z)Lzt4;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-super {p0, p1, p2, p3}, Lbc1;->f(ILzt4;Z)Lzt4;

    .line 15
    .line 16
    .line 17
    iget-wide p0, p0, Lsv2;->g:J

    .line 18
    .line 19
    iput-wide p0, p2, Lzt4;->d:J

    .line 20
    .line 21
    return-object p2

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final m(ILbu4;J)Lbu4;
    .locals 3

    .line 1
    iget v0, p0, Lsv2;->f:I

    .line 2
    .line 3
    iget-wide v1, p0, Lsv2;->g:J

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1, p2, p3, p4}, Lbc1;->m(ILbu4;J)Lbu4;

    .line 12
    .line 13
    .line 14
    iput-wide v1, p2, Lbu4;->l:J

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    iput-boolean p0, p2, Lbu4;->g:Z

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    iput-boolean p0, p2, Lbu4;->h:Z

    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    iput-object p0, p2, Lbu4;->i:Lan2;

    .line 24
    .line 25
    return-object p2

    .line 26
    :pswitch_0
    invoke-super {p0, p1, p2, p3, p4}, Lbc1;->m(ILbu4;J)Lbu4;

    .line 27
    .line 28
    .line 29
    iput-wide v1, p2, Lbu4;->l:J

    .line 30
    .line 31
    return-object p2

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
