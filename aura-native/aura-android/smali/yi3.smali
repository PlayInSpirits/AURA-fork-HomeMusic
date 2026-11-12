.class public final synthetic Lyi3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements La83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Laj3;

.field public final synthetic c:Lcom/eddyizm/tempus/subsonic/models/Child;


# direct methods
.method public synthetic constructor <init>(Laj3;Lcom/eddyizm/tempus/subsonic/models/Child;I)V
    .locals 0

    .line 1
    iput p3, p0, Lyi3;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lyi3;->b:Laj3;

    .line 4
    .line 5
    iput-object p2, p0, Lyi3;->c:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Lyi3;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lyi3;->c:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 5
    .line 6
    iget-object p0, p0, Lyi3;->b:Laj3;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Ljava/lang/String;

    .line 12
    .line 13
    iget-object v0, p0, Laj3;->j:Lk03;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lad2;->i(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Laj3;->k:Lk03;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lad2;->i(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lud3;->O()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    invoke-virtual {p0, v2, p1, v1}, Laj3;->g(Lcom/eddyizm/tempus/subsonic/models/Child;Ljava/lang/String;Lcom/eddyizm/tempus/subsonic/models/LyricsList;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void

    .line 39
    :pswitch_0
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/LyricsList;

    .line 40
    .line 41
    iget-object v0, p0, Laj3;->k:Lk03;

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Lad2;->i(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Laj3;->j:Lk03;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lad2;->i(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-static {}, Lud3;->O()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    invoke-static {p1}, Laj3;->d(Lcom/eddyizm/tempus/subsonic/models/LyricsList;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    invoke-virtual {p0, v2, v1, p1}, Laj3;->g(Lcom/eddyizm/tempus/subsonic/models/Child;Ljava/lang/String;Lcom/eddyizm/tempus/subsonic/models/LyricsList;)V

    .line 64
    .line 65
    .line 66
    :cond_1
    return-void

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
