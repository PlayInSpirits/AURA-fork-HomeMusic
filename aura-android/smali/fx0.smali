.class public final Lfx0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Laa4;
.implements Lgx0;


# instance fields
.field public final synthetic a:I

.field public final b:Laa4;

.field public final c:I


# direct methods
.method public constructor <init>(Laa4;II)V
    .locals 3

    .line 1
    iput p3, p0, Lfx0;->a:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/16 v1, 0x2e

    .line 5
    .line 6
    const-string v2, "count must be non-negative, but was "

    .line 7
    .line 8
    packed-switch p3, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lfx0;->b:Laa4;

    .line 18
    .line 19
    iput p2, p0, Lfx0;->c:I

    .line 20
    .line 21
    if-ltz p2, :cond_0

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-static {v2, p2, v1}, Lkf2;->i(Ljava/lang/String;II)V

    .line 25
    .line 26
    .line 27
    throw v0

    .line 28
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lfx0;->b:Laa4;

    .line 32
    .line 33
    iput p2, p0, Lfx0;->c:I

    .line 34
    .line 35
    if-ltz p2, :cond_1

    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    invoke-static {v2, p2, v1}, Lkf2;->i(Ljava/lang/String;II)V

    .line 39
    .line 40
    .line 41
    throw v0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(I)Laa4;
    .locals 4

    .line 1
    iget v0, p0, Lfx0;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Lfx0;->b:Laa4;

    .line 5
    .line 6
    iget v3, p0, Lfx0;->c:I

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    if-lt p1, v3, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance p0, Lfx0;

    .line 15
    .line 16
    invoke-direct {p0, v2, p1, v1}, Lfx0;-><init>(Laa4;II)V

    .line 17
    .line 18
    .line 19
    :goto_0
    return-object p0

    .line 20
    :pswitch_0
    add-int v0, v3, p1

    .line 21
    .line 22
    if-gez v0, :cond_1

    .line 23
    .line 24
    new-instance v0, Lfx0;

    .line 25
    .line 26
    invoke-direct {v0, p0, p1, v1}, Lfx0;-><init>(Laa4;II)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    new-instance p0, Lfn4;

    .line 31
    .line 32
    invoke-direct {p0, v2, v3, v0}, Lfn4;-><init>(Laa4;II)V

    .line 33
    .line 34
    .line 35
    move-object v0, p0

    .line 36
    :goto_1
    return-object v0

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(I)Laa4;
    .locals 3

    .line 1
    iget v0, p0, Lfx0;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lfx0;->b:Laa4;

    .line 4
    .line 5
    iget v2, p0, Lfx0;->c:I

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    if-lt p1, v2, :cond_0

    .line 11
    .line 12
    sget-object p0, Ly01;->a:Ly01;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance p0, Lfn4;

    .line 16
    .line 17
    invoke-direct {p0, v1, p1, v2}, Lfn4;-><init>(Laa4;II)V

    .line 18
    .line 19
    .line 20
    :goto_0
    return-object p0

    .line 21
    :pswitch_0
    add-int/2addr v2, p1

    .line 22
    const/4 v0, 0x0

    .line 23
    if-gez v2, :cond_1

    .line 24
    .line 25
    new-instance v1, Lfx0;

    .line 26
    .line 27
    invoke-direct {v1, p0, p1, v0}, Lfx0;-><init>(Laa4;II)V

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    new-instance p0, Lfx0;

    .line 32
    .line 33
    invoke-direct {p0, v1, v2, v0}, Lfx0;-><init>(Laa4;II)V

    .line 34
    .line 35
    .line 36
    move-object v1, p0

    .line 37
    :goto_1
    return-object v1

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    iget v0, p0, Lfx0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lex0;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, v1}, Lex0;-><init>(Lfx0;B)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :pswitch_0
    new-instance v0, Lex0;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Lex0;-><init>(Lfx0;)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
