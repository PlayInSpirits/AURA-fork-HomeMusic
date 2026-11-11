.class public final synthetic Lln2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lmk;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lpn2;


# direct methods
.method public synthetic constructor <init>(Lpn2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lln2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lln2;->o:Lpn2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lic2;
    .locals 4

    .line 1
    iget v0, p0, Lln2;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Lln2;->o:Lpn2;

    .line 4
    .line 5
    check-cast p1, Lm92;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {p0, p1}, Lpn2;->a(Lpn2;Lm92;)Llb4;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    const-string v0, "LibraryResult must not be null"

    .line 16
    .line 17
    invoke-static {p1, v0}, Lrr2;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Llb4;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iget v1, p1, Lm92;->a:I

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    iget-object p1, p1, Lm92;->c:Ljava/lang/Object;

    .line 31
    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    check-cast p1, Lgn2;

    .line 36
    .line 37
    iget-object v1, p1, Lgn2;->d:Ldo2;

    .line 38
    .line 39
    iget-object v1, v1, Ldo2;->k:[B

    .line 40
    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    invoke-static {p1, v2}, Lf92;->a(Lgn2;Landroid/graphics/Bitmap;)Lij2;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {v0, p0}, Lu0;->l(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    iget-object p0, p0, Lpn2;->z:Ltn2;

    .line 52
    .line 53
    iget-object p0, p0, Ltn2;->m:Lx7;

    .line 54
    .line 55
    invoke-virtual {p0, v1}, Lx7;->j([B)Lic2;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    new-instance v1, Lmn2;

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    invoke-direct {v1, v0, p0, v2}, Lmn2;-><init>(Llb4;Lic2;I)V

    .line 63
    .line 64
    .line 65
    sget-object v2, Lgq0;->n:Lgq0;

    .line 66
    .line 67
    invoke-virtual {v0, v1, v2}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 68
    .line 69
    .line 70
    new-instance v1, Lv6;

    .line 71
    .line 72
    const/16 v3, 0x19

    .line 73
    .line 74
    invoke-direct {v1, p0, v0, p1, v3}, Lv6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 75
    .line 76
    .line 77
    check-cast p0, Lk91;

    .line 78
    .line 79
    invoke-virtual {p0, v1, v2}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    :goto_0
    invoke-virtual {v0, v2}, Lu0;->l(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    :goto_1
    return-object v0

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
