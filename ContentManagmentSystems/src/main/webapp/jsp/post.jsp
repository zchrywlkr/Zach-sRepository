<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head style="background-color: orange">
        <title>Post</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet">
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">
    </head>
    <body >
        <div class="container " >
            <h1> 
                <ul id="topnav" class="nav nav-tabs" style="background-color: orange; border-bottom: 0px" >
                    <li role="presentation"><a href="${pageContext.request.contextPath}/index.jsp">Home</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/getStaticPage">Disclaimer</a></li>
                </ul>    
            </h1>

            <div   class="col-md-9 " >
                <h2 class="blogTitle">Blog Title</h2>
                <h4 class=blogTagline">Blog tagline</h4>
                <h3 class="pageTitle">Post</h3>
                <br>

                <h3 id="titleId" class="postTitle">Post Title</h3>
                <div>
                    <a href="${pageContext.request.contextPath}/getDate">Date</a>  &nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="${pageContext.request.contextPath}/getAuthor">Author</a>  &nbsp;&nbsp;&nbsp;&nbsp;
                </div>     
                <br>
                <div class="row">
                    <div class="postCategory col-md-4">Categories: <a href="${pageContext.request.contextPath}/getCategory">categoryX, categoryY</a></div>                                                                  
                    <div class="col-md-1"></div>
                    <div class="postTag col-md-4">Tags: <a href="${pageContext.request.contextPath}/getTag">tagX, tagY</a></div>
                </div>
                <br>
                <p class="content well" >
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Scisse enim te quis coarguere possit? Qui non moveatur et offensione turpitudinis et comprobatione honestatis? Duo Reges: constructio interrete. Non igitur potestis voluptate omnia dirigentes aut tueri aut retinere virtutem. Hic nihil fuit, quod quaereremus. Aliena dixit in physicis nec ea ipsa, quae tibi probarentur; Scio enim esse quosdam, qui quavis lingua philosophari possint; Quod autem meum munus dicis non equidem recuso, sed te adiungo socium. Quid ei reliquisti, nisi te, quoquo modo loqueretur, intellegere, quid diceret?

                    Si quicquam extra virtutem habeatur in bonis. Non quam nostram quidem, inquit Pomponius iocans; Quid de Platone aut de Democrito loquar? Tubulum fuisse, qua illum, cuius is condemnatus est rogatione, P. Tum Torquatus: Prorsus, inquit, assentior;

                    Utinam quidem dicerent alium alio beatiorem! Iam ruinas videres. Disserendi artem nullam habuit. Nam prius a se poterit quisque discedere quam appetitum earum rerum, quae sibi conducant, amittere. Commoda autem et incommoda in eo genere sunt, quae praeposita et reiecta diximus; Tria genera bonorum; Faceres tu quidem, Torquate, haec omnia; At enim, qua in vita est aliquid mali, ea beata esse non potest. Contineo me ab exemplis. Quam illa ardentis amores excitaret sui! Cur tandem? At iam decimum annum in spelunca iacet.

                    Ita relinquet duas, de quibus etiam atque etiam consideret. Sic enim censent, oportunitatis esse beate vivere. Ergo illi intellegunt quid Epicurus dicat, ego non intellego? Eam tum adesse, cum dolor omnis absit; Non est enim vitium in oratione solum, sed etiam in moribus. Quid, de quo nulla dissensio est? Non est enim vitium in oratione solum, sed etiam in moribus. Nos commodius agimus.

                    Cur deinde Metrodori liberos commendas? Videmus igitur ut conquiescere ne infantes quidem possint. Cupiditates non Epicuri divisione finiebat, sed sua satietate. Etenim semper illud extra est, quod arte comprehenditur.

                    dsad asdfas dasd</p>


                <div class="row">
                            <form>
                                <a href="${pageContext.request.contextPath}/editPost" class="btn btn-info btn-sm col-md-2" role="button">Edit Post</a> 
                                <div class="col-md-1"></div>
                                <a href="${pageContext.request.contextPath}/index.jsp" class="btn btn-info btn-sm col-md-2" role="button">Delete Post</a> 
                                <div class="col-md-2"></div>
                                <button class="togglePublishUnpublish btn btn-danger btn-sm col-md-2" type="submit" >Publish</button>
                            </form>
                        </div>
                <div class="comments">
                    <h4>Comments</h4>
                    <button id="addComment">Add Comment</button>
                    <br>
                    <br>
                    <div class="comment">
                        <a href="getAuthor">By: author</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="getDate">on date</a>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Hanc quoque iucunditatem, si vis, transfer in animum; 
                            Quod autem in homine praestantissimum atque optimum est, id deseruit. Dat enim intervalla et relaxat. Si quae forte-possumus. 
                            Causa autem fuit huc veniendi ut quosdam hinc libros promerem. </p>
                        <hr>
                    </div>
                    <div class="comment">

                        <a href="getAuthor">By: author</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="getDate">on date</a>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Hanc quoque iucunditatem, si vis, transfer in 
                            animum; Quod autem in homine praestantissimum atque optimum est, id deseruit. Dat enim intervalla et relaxat. 
                            Si quae forte-possumus. Causa autem fuit huc veniendi ut quosdam hinc libros promerem. </p>
                        <hr>
                    </div>
                    <div class="comment">

                        <a href="getAuthor">By: author</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="getDate">on date</a>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Hanc quoque iucunditatem, si vis, transfer in animum; 
                            Quod autem in homine praestantissimum atque optimum est, id deseruit. Dat enim intervalla et relaxat. Si quae 
                            forte-possumus. Causa autem fuit huc veniendi ut quosdam hinc libros promerem. </p>
                        <hr>
                    </div>
                </div>
            </div>
            <div class="col-xs-3" style="background: #5675e6" id="sidenav">
                <ul class="nav nav-tabs nav-stacked" >
                    <li class="login"><a href="${pageContext.request.contextPath}/login">Login</a></li>
                </ul>
                <div class="col-xs-12"><h3>Categories</h3></div>
                <ul class="nav nav-tabs nav-stacked">
                    <li class="category"><a href="${pageContext.request.contextPath}/getCategory">Category 1</a></li>
                    <li class="category"><a href="${pageContext.request.contextPath}/getCategory">Category 2</a></li>
                    <li class="category"><a href="${pageContext.request.contextPath}/getCategory">Category 3</a></li>
                    <li class="category"><a href="${pageContext.request.contextPath}/getCategory">Category 4</a></li>
                    <li class="category"><a href="${pageContext.request.contextPath}/getCategory">Category 5</a></li>
                    <br/>
                </ul>
                <div class="col-xs-12"><h3>Tags</h3></div>

                <ul class="nav nav-tabs nav-stacked">
                    <li class="tag"><a href="${pageContext.request.contextPath}/getTag">Tag 1</a></li>
                    <li class="tag"><a href="${pageContext.request.contextPath}/getTag">Tag 2</a></li>
                    <li class="tag"><a href="${pageContext.request.contextPath}/getTag">Tag 3</a></li>
                    <li class="tag"><a href="${pageContext.request.contextPath}/getTag">Tag 4</a></li>
                    <li class="tag"><a href="${pageContext.request.contextPath}/getTag">Tag 5</a></li>
                </ul>          
            </div>
            <div style="background-color: #5bc0de"class="col-sm-12"id="footer">Copyright@2015 Best Group Ever</div>
        </div>
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/ContentManagment.js"></script>

    </body>
</html>